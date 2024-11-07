package com.AdrianPeiro.PrimerEjercicio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("edat")
    private int edat;


    public Usuario(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public Usuario() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }
}
