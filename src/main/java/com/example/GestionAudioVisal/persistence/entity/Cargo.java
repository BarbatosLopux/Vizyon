package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCargo;
    private String descripcion;
    private int sueldoBase;

    @OneToMany(mappedBy = "cargo")
    private List<Empleado> empleados;

    public Cargo() {
    }

    public Cargo(int idCargo, String descripcion, int sueldoBase, List<Empleado> empleados) {
        this.idCargo = idCargo;
        this.descripcion = descripcion;
        this.sueldoBase = sueldoBase;
        this.empleados = empleados;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
