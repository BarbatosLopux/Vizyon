package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMunicipio;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idDepartamentoFk")
    private Departamento departamento;

    public Municipio(String nombre, int idMunicipio, Departamento departamento) {
        this.nombre = nombre;
        this.idMunicipio = idMunicipio;
        this.departamento = departamento;
    }

    public Municipio() {
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
