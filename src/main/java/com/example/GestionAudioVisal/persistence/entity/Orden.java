package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrden;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idEmpleadoFk")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idClienteFk")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idEstadoFk")
    private Estado estado;

    @OneToMany(mappedBy = "orden")
    private List<DetalleOrden> detalleOrdenes;

    public Orden(int idOrden, Date fecha, Empleado empleado, Cliente cliente, Estado estado, List<DetalleOrden> detalleOrdenes) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.estado = estado;
        this.detalleOrdenes = detalleOrdenes;
    }

    public Orden() {
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<DetalleOrden> getDetalleOrdenes() {
        return detalleOrdenes;
    }

    public void setDetalleOrdenes(List<DetalleOrden> detalleOrdenes) {
        this.detalleOrdenes = detalleOrdenes;
    }
}
