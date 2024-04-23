package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nit;
    private String razonSocial;
    private String representanteLegal;
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "idMunicipioFk")
    private Municipio municipio;




    public Empresa(int idEmpresa, String nit, String razonSocial, String representanteLegal, Date fechaCreacion, Municipio municipio) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.representanteLegal = representanteLegal;
        this.fechaCreacion = fechaCreacion;
        this.municipio = municipio;
    }

    public Empresa() {
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
