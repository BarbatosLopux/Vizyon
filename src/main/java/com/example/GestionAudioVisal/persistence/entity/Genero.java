package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenero;
    private String descripcion;

    @OneToMany(mappedBy = "genero")
    private List<Prenda> prendas;

    public Genero(int idGenero, String descripcion, List<Prenda> prendas) {
        this.idGenero = idGenero;
        this.descripcion = descripcion;
        this.prendas = prendas;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
