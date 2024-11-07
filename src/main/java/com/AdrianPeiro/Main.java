package com.AdrianPeiro.PrimerEjercicio;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Usuario usuario1 = new Usuario("Josevi", 45);

        Datos datos = new Datos(usuario1);

        try {
            File fichero = new File("src/main/resources/ejemplo1Serializado.json");
            objectMapper.writeValue(fichero, datos);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
