package com.reto2.reto2.controllers;

import com.reto2.reto2.Libro;
import com.reto2.reto2.Prestamo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PrestamoController {
    List<Libro> libros = new ArrayList<>(List.of(
            new Libro(1, "Terror", 2, "Pepe", "En el monte"),
            new Libro(2, "Comedia/Comic", 5, "No se", "Mortadelo y Filemon"),
            new Libro(3, "Suspense", 0, "Marta", "Aquella noche"),
            new Libro(4, "Ciencia Ficcion", 1, "Domingo", "Cyberpunk"),
            new Libro(5, "Psicologia", 3, "Ana", "El poder de la mente")
    ));

    @GetMapping("/prestamo")
    public String mostrarFormulario(){
        return "prestamo";
    }

    @PostMapping("/prestamo")
    @ResponseBody
    public String procesarPrestamo(@ModelAttribute Prestamo prestamo){

        if (prestamo.getDiasPrestamo() < 1 || prestamo.getDiasPrestamo() > 30){
            return "Duración no válida (1-30 días)";
        }




    }
}
