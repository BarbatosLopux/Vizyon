package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor;
    private String nitProveedor;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idTipoPersona")
    private TipoPersona tipoPersona;

    @ManyToOne
    @JoinColumn(name = "idMunicipioFk")
    private Municipio municipio;

    public Proveedor(int idProveedor, String nitProveedor, String nombre, TipoPersona tipoPersona, Municipio municipio) {
        this.idProveedor = idProveedor;
        this.nitProveedor = nitProveedor;
        this.nombre = nombre;
        this.tipoPersona = tipoPersona;
        this.municipio = municipio;
    }

    public Proveedor() {
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
