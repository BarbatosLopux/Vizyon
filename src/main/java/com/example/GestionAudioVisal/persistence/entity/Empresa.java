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
}
