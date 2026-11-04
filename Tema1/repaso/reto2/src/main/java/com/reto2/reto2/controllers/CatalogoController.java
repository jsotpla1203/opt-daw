package com.reto2.reto2.controllers;

import com.reto2.reto2.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CatalogoController {

    private List<Libro> libros;

    public CatalogoController() {
        libros = new ArrayList<>();
        libros.add(new Libro(1, "Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", 3));
        libros.add(new Libro(2, "La casa de Bernarda Alba", "Federico García Lorca", "Teatro", 2));
        libros.add(new Libro(3, "Cien años de soledad", "Gabriel García Márquez", "Novela", 4));
        libros.add(new Libro(4, "El principito", "Antoine de Saint-Exupéry", "Fábula", 0));
        libros.add(new Libro(5, "La sombra del viento", "Carlos Ruiz Zafón", "Misterio", 1));
    }

    @GetMapping("/prestamo")
    public String mostrarFormulario(){
        return "prestamo";
    }

    @PostMapping("/prestar")
    @ResponseBody
    public Respuesta procesarPrestamo(@ModelAttribute Prestamo prestamo){

        Libro libro = null;

        for (Libro l : libros) {
            if (l.getId().equals(prestamo.getLibroId())) {
                libro = l;
                break;
            }
        }

        if (libro == null){
            return new Respuesta(Estado.RECHAZADO, "Libro no encontrado");
        }
        if (libro.getEjemplaresDisponibles() == 0){
            return new Respuesta(Estado.RECHAZADO, "Sin ejemplares disponibles");
        }
        if (prestamo.getDiasPrestamo() < 1 || prestamo.getDiasPrestamo() > 30){
            return new Respuesta(Estado.RECHAZADO, "Duración no válida (1-30 días)");
        }
        else {

            Integer diasSolicitados = prestamo.getDiasPrestamo();
            int diasTotales = diasSolicitados;

            if (prestamo.getCarnetPremium() == true) {
                diasTotales += 7;
            }

            return new Respuesta(Estado.CONCEDIDO,
                    prestamo.getNombreSocio(),
                    libro.getTitulo(),
                    diasTotales,
                    LocalDate.now().plusDays(diasTotales));
        }

    }

    @GetMapping("/libros")
    @ResponseBody
    public RespuestaLibros respuestaLibros(@ModelAttribute Integer id){

        Libro libro = null;

        for (Libro l : libros) {
            if (l.getId().equals(id)) {
                libro = l;
                break;
            }
        }

        if (libro == null) {
            return new RespuestaLibros("Libro no encontrado");
        }
        return new RespuestaLibros(libro);

    }


}
