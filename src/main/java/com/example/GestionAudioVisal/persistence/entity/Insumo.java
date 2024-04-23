package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private int valorUnit;
    private int stockMin;
    private int stockMax;

    @ManyToMany(mappedBy = "insumos")
    private List<Prenda> prendas;


    public Insumo(int idInsumo, String nombre, int valorUnit, int stockMin, int stockMax, List<Prenda> prendas) {
        this.nombre = nombre;
        this.valorUnit = valorUnit;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
        this.prendas = prendas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(int valorUnit) {
        this.valorUnit = valorUnit;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }
}
