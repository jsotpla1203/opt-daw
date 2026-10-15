package com.actividad5.actividad5;


public class RespuestaPedido {
    String cliente;
    Integer totalProductos;
    Double precioTotal;
    String mensaje;

    public RespuestaPedido() {
    }

    public RespuestaPedido(String cliente, Integer totalProductos, Double precioTotal, String mensaje) {
        this.cliente = cliente;
        this.totalProductos = totalProductos;
        this.precioTotal = precioTotal;
        this.mensaje = mensaje;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Integer getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(Integer totalProductos) {
        this.totalProductos = totalProductos;
    }
}
