package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private Date fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "idCargoFk")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "idMunicipioFk")
    private Municipio municipio;

    public Empleado(int idEmpleado, String nombre, Date fechaIngreso, Cargo cargo, Municipio municipio) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.municipio = municipio;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
