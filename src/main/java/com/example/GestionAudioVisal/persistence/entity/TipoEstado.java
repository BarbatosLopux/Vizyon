package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoEstado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoEstado;
    private String descripcion;

    @OneToMany(mappedBy = "tipoEstado")
    private List<Estado> estados;

    public TipoEstado(int idTipoEstado, String descripcion, List<Estado> estados) {
        this.idTipoEstado = idTipoEstado;
        this.descripcion = descripcion;
        this.estados = estados;
    }

    public TipoEstado() {
    }

    public int getIdTipoEstado() {
        return idTipoEstado;
    }

    public void setIdTipoEstado(int idTipoEstado) {
        this.idTipoEstado = idTipoEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
