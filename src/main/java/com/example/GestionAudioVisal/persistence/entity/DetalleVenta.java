package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cantidad;
    private double valorUnit;

    @ManyToOne
    @JoinColumn(name = "idVentaFk")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "idProductoFk")
    private Prenda prenda;

    @ManyToOne
    @JoinColumn(name = "idTallaFk")
    private Talla talla;

    public DetalleVenta(int idDetalleVenta, int cantidad, double valorUnit, Venta venta, Prenda prenda, Talla talla) {
        this.cantidad = cantidad;
        this.valorUnit = valorUnit;
        this.venta = venta;
        this.prenda = prenda;
        this.talla = talla;
    }

    public DetalleVenta() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}
