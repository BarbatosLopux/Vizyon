package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idPaisFk")
    private Pais pais;

    @OneToMany(mappedBy = "departamento")
    private List<Municipio> municipios;

    public Departamento(int idDepartamento, String nombre, List<Municipio> municipios, Pais pais) {
        this.nombre = nombre;
        this.municipios = municipios;
        this.pais = pais;
    }

    public Departamento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
