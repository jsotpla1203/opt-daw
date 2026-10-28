package com.reto1.reto1;

import com.reto1.reto1.enums.Estado;

public class Respuesta {

    public Estado estado;
    public String motivo;
    public String cliente;
    public Integer entrada;
    public Double precioUnitario;
    public Double subtotal;
    public Double descuento;
    public Double totalPagar;


    public Respuesta() {
    }

    public Respuesta(Estado estado, Double totalPagar, Double subtotal, Integer entrada, String cliente, Double precioUnitario, Double descuento) {
        this.estado = estado;
        this.totalPagar = totalPagar;
        this.subtotal = subtotal;
        this.entrada = entrada;
        this.cliente = cliente;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
    }

    public Respuesta(Estado estado, String motivo) {
        this.estado = estado;
        this.motivo = motivo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
