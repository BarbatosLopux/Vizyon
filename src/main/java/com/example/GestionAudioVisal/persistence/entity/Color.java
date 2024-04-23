package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String descripcion;

    @ManyToMany(mappedBy = "colores")
    private List<Prenda> prendas;


    public Color(int idColor, String descripcion, List<Prenda> prendas) {
        this.descripcion = descripcion;
        this.prendas = prendas;
    }

    public Color() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

