package br.com.alura.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados implements IConverteDados {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T fromJson(String json, Class clazz) {
        try {
            return (T) objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            e.getMessage();
        }
        return null;
    }
}

