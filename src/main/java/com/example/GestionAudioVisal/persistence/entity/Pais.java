package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPais;
    private String nombre;

    @OneToMany(mappedBy = "pais")
    private List<Departamento> departamentos;

    public Pais(int idPais, String nombre, List<Departamento> departamentos) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public Pais() {
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

