package br.com.alura.demo.service;

public interface IConverteDados {


    <T> T fromJson(String json, Class clazz);
}
