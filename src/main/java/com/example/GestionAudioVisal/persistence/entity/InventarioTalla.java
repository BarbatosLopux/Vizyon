package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class InventarioTalla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInvTalla;

    @ManyToOne
    @JoinColumn(name = "idInvFk")
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "idTallaFk")
    private Talla talla;

    public InventarioTalla(int idInvTalla, Inventario inventario, Talla talla) {
        this.idInvTalla = idInvTalla;
        this.inventario = inventario;
        this.talla = talla;
    }

    public int getIdInvTalla() {
        return idInvTalla;
    }

    public void setIdInvTalla(int idInvTalla) {
        this.idInvTalla = idInvTalla;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}
