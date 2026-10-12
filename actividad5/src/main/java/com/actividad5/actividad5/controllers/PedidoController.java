package com.actividad5.actividad5.controllers;

import com.actividad5.actividad5.Pedido;
import com.actividad5.actividad5.Producto;
import com.actividad5.actividad5.RespuestaPedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PedidoController {

    @PostMapping("/pedido")
    public RespuestaPedido recibirPedido(@RequestBody Pedido pedido) {
        String cliente = pedido.getCliente().getNombre();
        Integer totalProductos = 0;
        Double precioTotal = 0.0;


        for (Producto producto : pedido.getProductos()) {
            totalProductos += producto.getCantidad();
            precioTotal += producto.getPrecioUnitario() * producto.getCantidad();
        }

        return new RespuestaPedido(
                cliente,
                totalProductos,
                precioTotal,
                "Pedido realizado correctamente"
        );
    }
}