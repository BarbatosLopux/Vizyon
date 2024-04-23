package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "idTipoPersonaFk")
    private TipoPersona tipoPersona;

    @ManyToOne
    @JoinColumn(name = "idMunicipioFk")
    private Municipio municipio;

    public Cliente(int idCliente, String nombre, Date fechaRegistro, TipoPersona tipoPersona, Municipio municipio) {
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.tipoPersona = tipoPersona;
        this.municipio = municipio;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
