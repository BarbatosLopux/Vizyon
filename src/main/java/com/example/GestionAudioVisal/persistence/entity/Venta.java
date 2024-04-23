package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idEmpleadoFk")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idClienteFk")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idFormaPagoFk")
    private FormaPago formaPago;

    public Venta(int idVenta, Date fecha, Empleado empleado, Cliente cliente, FormaPago formaPago) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.formaPago = formaPago;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
}
