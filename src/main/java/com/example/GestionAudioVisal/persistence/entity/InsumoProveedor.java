package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class InsumoProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInsumoProveedor;

    @ManyToOne
    @JoinColumn(name = "idInsumoFk")
    private Insumo insumo;

    @ManyToOne
    @JoinColumn(name = "idProveedorFk")
    private Proveedor proveedor;

    public InsumoProveedor(int idInsumoProveedor, Insumo insumo, Proveedor proveedor) {
        this.idInsumoProveedor = idInsumoProveedor;
        this.insumo = insumo;
        this.proveedor = proveedor;
    }

    public InsumoProveedor() {
    }

    public int getIdInsumoProveedor() {
        return idInsumoProveedor;
    }

    public void setIdInsumoProveedor(int idInsumoProveedor) {
        this.idInsumoProveedor = idInsumoProveedor;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
