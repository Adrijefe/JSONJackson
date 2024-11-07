package com.AdrianPeiro.PrimerEjercicio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MainDeserealizado {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File archivo = new File("src/main/resources/ejemplo1.json");
        Datos datos = objectMapper.readValue(archivo, Datos.class);
        System.out.println(datos.getUsuari());
    }
}
