package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

@Entity
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cantidadProducir;
    private int cantidadProducida;

    @ManyToOne
    @JoinColumn(name = "idOrdenFk")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "idPrendaFk")
    private Prenda prenda;

    @ManyToOne
    @JoinColumn(name = "idColorFk")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "idEstadoFk")
    private Estado estado;

    public DetalleOrden(int idDetalleOrden, int cantidadProducir, int cantidadProducida, Orden orden, Prenda prenda, Color color, Estado estado) {
        this.cantidadProducir = cantidadProducir;
        this.cantidadProducida = cantidadProducida;
        this.orden = orden;
        this.prenda = prenda;
        this.color = color;
        this.estado = estado;
    }



    public int getCantidadProducir() {
        return cantidadProducir;
    }

    public void setCantidadProducir(int cantidadProducir) {
        this.cantidadProducir = cantidadProducir;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
