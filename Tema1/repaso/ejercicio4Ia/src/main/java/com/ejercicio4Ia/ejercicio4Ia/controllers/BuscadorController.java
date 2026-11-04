package com.ejercicio4Ia.ejercicio4Ia.controllers;

import com.ejercicio4Ia.ejercicio4Ia.Producto;
import com.ejercicio4Ia.ejercicio4Ia.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BuscadorController {
    private List<Producto> productos;

    public BuscadorController() {
        productos = new ArrayList<>();
        productos.add(new Producto("Pelota", 2));
        productos.add(new Producto("Raqueta", 17));
        productos.add(new Producto("casco", 30));
    }

    @GetMapping("/buscar")
    public Response busquedaProducto(@RequestParam String nombre){

        String prod = "";

        for (Producto p : productos){
            if (p.getNombre().equals(nombre)){
                prod = nombre;
                break;
            }
        }

        return new Response(prod);
    }

}
