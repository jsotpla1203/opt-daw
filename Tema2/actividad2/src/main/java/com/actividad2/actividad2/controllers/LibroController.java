package com.actividad2.actividad2.controllers;

import com.actividad2.actividad2.dtos.CrearLibroDto;
import com.actividad2.actividad2.services.LibroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public ResponseEntity<?> crearLibro(@RequestBody CrearLibroDto crearLibroDto){
        return libroService.crearLibro(crearLibroDto);
    }

    @GetMapping
    public ResponseEntity<?> listarLibros(){
        return libroService.listarLibros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> BuscarId(@PathVariable Long id){
        return libroService.buscarLibro(id);
    }

    @PostMapping("/{id}/prestamo")
    public ResponseEntity<?> prestarLibro(@PathVariable Long id){
        return libroService.prestarLibro(id);
    }

    @PostMapping("/{id}/devolucion")
    public ResponseEntity<?> devolverLibro(@PathVariable Long id) {
        return libroService.devolverLibro(id);
    }
}
