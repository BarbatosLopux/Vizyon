package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class TipoPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPersona;
    private String nombre;

    @OneToMany(mappedBy = "tipoPersona")
    private List<Cliente> clientes;

    public TipoPersona(int idTipoPersona, String nombre, List<Cliente> clientes) {
        this.idTipoPersona = idTipoPersona;
        this.nombre = nombre;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
}
