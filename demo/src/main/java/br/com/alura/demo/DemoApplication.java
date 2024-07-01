package br.com.alura.demo;

import br.com.alura.demo.model.DadosSerie;
import br.com.alura.demo.service.ConsumoAPI;
import br.com.alura.demo.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
        System.out.println(json.toString());
        ConverterDados converter = new ConverterDados();
        DadosSerie dadosSerie = converter.fromJson(json, DadosSerie.class);
        System.out.println(dadosSerie.toString());


    }
}
