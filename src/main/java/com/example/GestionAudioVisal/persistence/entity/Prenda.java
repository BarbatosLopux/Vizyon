package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrenda;
    private String nombre;
    private double valorUnitCop;
    private double valorUnitUsd;
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "idEstadoFk")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "idTipoProteccion")
    private TipoProteccion tipoProteccion;

    @ManyToOne
    @JoinColumn(name = "idGeneroFk")
    private Genero genero;

    @OneToMany(mappedBy = "prenda")
    private List<Inventario> inventarios;

    @OneToMany(mappedBy = "prenda")
    private List<DetalleVenta> detalleVentas;

    @OneToMany(mappedBy = "prenda")
    private List<DetalleOrden> detalleOrdenes;

    @OneToMany(mappedBy = "prenda")
    private List<InsumoPrendas> insumosPrenda;
    @ManyToMany
    @JoinTable(
            name = "prenda_color",
            joinColumns = @JoinColumn(name = "prenda_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    private List<Color> colores;
    @ManyToMany
    @JoinTable(
            name = "insumo_prenda",
            joinColumns = @JoinColumn(name = "prenda_id"),
            inverseJoinColumns = @JoinColumn(name = "insumo_id")
    )
    private List<Insumo> insumos;


    public Prenda(int idPrenda, String nombre, double valorUnitCop, double valorUnitUsd, String codigo, Estado estado, TipoProteccion tipoProteccion, Genero genero, List<Inventario> inventarios, List<DetalleVenta> detalleVentas, List<DetalleOrden> detalleOrdenes, List<InsumoPrendas> insumosPrenda) {
        this.idPrenda = idPrenda;
        this.nombre = nombre;
        this.valorUnitCop = valorUnitCop;
        this.valorUnitUsd = valorUnitUsd;
        this.codigo = codigo;
        this.estado = estado;
        this.tipoProteccion = tipoProteccion;
        this.genero = genero;
        this.inventarios = inventarios;
        this.detalleVentas = detalleVentas;
        this.detalleOrdenes = detalleOrdenes;
        this.insumosPrenda = insumosPrenda;
    }

    public Prenda() {
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorUnitUsd() {
        return valorUnitUsd;
    }

    public void setValorUnitUsd(double valorUnitUsd) {
        this.valorUnitUsd = valorUnitUsd;
    }

    public double getValorUnitCop() {
        return valorUnitCop;
    }

    public void setValorUnitCop(double valorUnitCop) {
        this.valorUnitCop = valorUnitCop;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoProteccion getTipoProteccion() {
        return tipoProteccion;
    }

    public void setTipoProteccion(TipoProteccion tipoProteccion) {
        this.tipoProteccion = tipoProteccion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public List<DetalleOrden> getDetalleOrdenes() {
        return detalleOrdenes;
    }

    public void setDetalleOrdenes(List<DetalleOrden> detalleOrdenes) {
        this.detalleOrdenes = detalleOrdenes;
    }

    public List<InsumoPrendas> getInsumosPrenda() {
        return insumosPrenda;
    }

    public void setInsumosPrenda(List<InsumoPrendas> insumosPrenda) {
        this.insumosPrenda = insumosPrenda;
    }
}
