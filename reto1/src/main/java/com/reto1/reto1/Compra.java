package com.reto1.reto1;

public class Compra {

    public Integer eventoId;
    public String nombreCliente;
    public String tipoEntrada;
    public Integer cantidad;
    public String codigoCupon;

    public Compra() {
    }

    public Compra(Integer eventoId, Integer cantidad, String codigoCupon, String tipoEntrada, String nombreCliente) {
        this.eventoId = eventoId;
        this.cantidad = cantidad;
        this.codigoCupon = codigoCupon;
        this.tipoEntrada = tipoEntrada;
        this.nombreCliente = nombreCliente;
    }

    public Integer getEventoId() {
        return eventoId;
    }

    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigoCupon() {
        return codigoCupon;
    }

    public void setCodigoCupon(String codigoCupon) {
        this.codigoCupon = codigoCupon;
    }
}
