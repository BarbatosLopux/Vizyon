package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class InsumoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInsumoPrenda;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idInsumoFk")
    private Insumo insumo;

    @ManyToOne
    @JoinColumn(name = "idPrendaFk")
    private Prenda prenda;

    public InsumoPrenda(int idInsumoPrenda, int cantidad, Insumo insumo, Prenda prenda) {
        this.idInsumoPrenda = idInsumoPrenda;
        this.cantidad = cantidad;
        this.insumo = insumo;
        this.prenda = prenda;
    }

    public int getIdInsumoPrenda() {
        return idInsumoPrenda;
    }

    public void setIdInsumoPrenda(int idInsumoPrenda) {
        this.idInsumoPrenda = idInsumoPrenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }
}
