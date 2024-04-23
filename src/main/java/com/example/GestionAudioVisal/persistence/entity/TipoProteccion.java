package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoProteccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoProteccion;
    private String descripcion;

    @OneToMany(mappedBy = "tipoProteccion")
    private List<Prenda> prendas;

    public TipoProteccion(List<Prenda> prendas, int idTipoProteccion, String descripcion) {
        this.prendas = prendas;
        this.idTipoProteccion = idTipoProteccion;
        this.descripcion = descripcion;
    }

    public TipoProteccion() {
    }

    public int getIdTipoProteccion() {
        return idTipoProteccion;
    }

    public void setIdTipoProteccion(int idTipoProteccion) {
        this.idTipoProteccion = idTipoProteccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
