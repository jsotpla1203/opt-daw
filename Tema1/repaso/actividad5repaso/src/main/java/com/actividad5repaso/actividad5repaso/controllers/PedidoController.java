package com.actividad5repaso.actividad5repaso.controllers;

import com.actividad5repaso.actividad5repaso.models.Pedido;
import com.actividad5repaso.actividad5repaso.models.Producto;
import com.actividad5repaso.actividad5repaso.models.RespuestaPedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @PostMapping("/pedido")
    public RespuestaPedido procesarPedido(@RequestBody Pedido pedido){
        int totalProductos = 0;
        double precioTotal = 0.0;

        for(Producto producto : pedido.getProductos()){
            totalProductos += producto.getCantidad();
            precioTotal += producto.getPrecioUnitario() * producto.getCantidad();
        }

        return new RespuestaPedido(
                pedido.getCliente().getNombre(),
                totalProductos,
                precioTotal,
                "Pedido realizado correctamente"
        );
    }
}
