package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;


@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idTipoEstadoFk")
    private TipoEstado tipoEstado;

    public Estado(int idEstado, String descripcion, TipoEstado tipoEstado) {
        this.descripcion = descripcion;
        this.tipoEstado = tipoEstado;
    }

    public Estado() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
