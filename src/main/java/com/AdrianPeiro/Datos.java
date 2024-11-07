package com.AdrianPeiro.PrimerEjercicio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Datos {
    @JsonProperty("usuari")
    private Usuario usuari;


    public Datos(Usuario usuari) {
        this.usuari = usuari;
    }

    public Datos() {
    }

    public Usuario getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuario usuari) {
        this.usuari = usuari;
    }
}
