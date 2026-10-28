package com.actividad9.actividad9.controller;

import com.actividad9.actividad9.Producto;
import com.actividad9.actividad9.Respuesta;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CatalogoController {

    List<Producto> productos = new ArrayList<>();


    @GetMapping("/productos")
    public ResponseEntity<?> listar(){
        if (productos.size() == 0){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(productos);
        }
    }

    @GetMapping("/productos/buscar")
    public ResponseEntity<?> buscar(@RequestParam Integer id) {

        Optional<Producto> resultado = null;
        for (Producto producto : productos){
            if (producto.getId() == id){
                resultado = Optional.of(producto);
                break;
            }
        }

        if (resultado == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Respuesta("No se ha encontrado el producto con el id " + id));
        }

        return ResponseEntity.ok().body(resultado);
    }

    @GetMapping("/productos/resumen")
    public ResponseEntity<?> resumen(){
        if (productos.size() == 0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        else {
            return ResponseEntity.ok().body(new Respuesta("Hay "+productos.size()+" productos"));
        }
    }

    @PostMapping("/productos/enviar")
    public ResponseEntity<?> nuevo(@RequestBody Producto producto){
        if (productos.size() == 5){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new Respuesta("El catalogo esta lleno"));
        }
        productos.add(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(producto);

    }

}
