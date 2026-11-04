package com.reto1.reto1.models;

public class Reserva {
    private String eventoId;
    private String nombreCliente;
    private TipoEntrada tipoEntrada;
    private Integer cantidad;
    private String codigoCupon;

    public Reserva() {
    }

    public Reserva(String eventoId, String nombreCliente, TipoEntrada tipoEntrada, Integer cantidad) {
        this.eventoId = eventoId;
        this.nombreCliente = nombreCliente;
        this.tipoEntrada = tipoEntrada;
        this.cantidad = cantidad;
    }

    public Reserva(String eventoId, String nombreCliente, TipoEntrada tipoEntrada, Integer cantidad, String codigoCupon) {
        this.eventoId = eventoId;
        this.nombreCliente = nombreCliente;
        this.tipoEntrada = tipoEntrada;
        this.cantidad = cantidad;
        this.codigoCupon = codigoCupon;
    }

    public String getEventoId() {
        return eventoId;
    }

    public void setEventoId(String eventoId) {
        this.eventoId = eventoId;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoCupon() {
        return codigoCupon;
    }

    public void setCodigoCupon(String codigoCupon) {
        this.codigoCupon = codigoCupon;
    }
}
