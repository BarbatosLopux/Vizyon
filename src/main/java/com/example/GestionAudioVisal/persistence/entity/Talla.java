package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTalla;
    private String descripcion;

    @OneToMany(mappedBy = "talla")
    private List<DetalleVenta> detallesVenta;

    public Talla(int idTalla, String descripcion, List<DetalleVenta> detallesVenta) {
        this.idTalla = idTalla;
        this.descripcion = descripcion;
        this.detallesVenta = detallesVenta;
    }

    public Talla() {
    }

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
