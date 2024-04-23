package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInventario;
    private String codInv;
    private double valorVtaCop;
    private double valorVtaUsd;

    @ManyToOne
    @JoinColumn(name = "idPrendaFk")
    private Prenda prenda;

    @OneToMany(mappedBy = "inventario")
    private List<InventarioTalla> inventarioTallas;

    public Inventario(int idInventario, String codInv, double valorVtaCop, double valorVtaUsd, Prenda prenda, List<InventarioTalla> inventarioTallas) {
        this.idInventario = idInventario;
        this.codInv = codInv;
        this.valorVtaCop = valorVtaCop;
        this.valorVtaUsd = valorVtaUsd;
        this.prenda = prenda;
        this.inventarioTallas = inventarioTallas;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodInv() {
        return codInv;
    }

    public void setCodInv(String codInv) {
        this.codInv = codInv;
    }

    public double getValorVtaCop() {
        return valorVtaCop;
    }

    public void setValorVtaCop(double valorVtaCop) {
        this.valorVtaCop = valorVtaCop;
    }

    public double getValorVtaUsd() {
        return valorVtaUsd;
    }

    public void setValorVtaUsd(double valorVtaUsd) {
        this.valorVtaUsd = valorVtaUsd;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public List<InventarioTalla> getInventarioTallas() {
        return inventarioTallas;
    }

    public void setInventarioTallas(List<InventarioTalla> inventarioTallas) {
        this.inventarioTallas = inventarioTallas;
    }
}
