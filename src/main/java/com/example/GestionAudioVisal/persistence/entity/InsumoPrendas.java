package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class InsumoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idInsumoFk")
    private Insumo insumo;

    @ManyToOne
    @JoinColumn(name = "idPrendaFk")
    private Prenda prenda;

    public InsumoPrenda( int cantidad, Insumo insumo, Prenda prenda) {
        this.cantidad = cantidad;
        this.insumo = insumo;
        this.prenda = prenda;
    }

    public InsumoPrenda() {
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
