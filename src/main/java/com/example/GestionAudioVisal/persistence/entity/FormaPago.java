package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String descripcion;

    @OneToMany(mappedBy = "formaPago")
    private List<Venta> ventas;


    public FormaPago(int idFormaPago, String descripcion, List<Venta> ventas) {
        this.descripcion = descripcion;
        this.ventas = ventas;
    }

    public FormaPago() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}

