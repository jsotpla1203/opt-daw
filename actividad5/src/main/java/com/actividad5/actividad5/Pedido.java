package com.actividad5.actividad5;

import java.util.List;

public class Pedido {
    Cliente cliente;
    List<Producto> productos;

    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
