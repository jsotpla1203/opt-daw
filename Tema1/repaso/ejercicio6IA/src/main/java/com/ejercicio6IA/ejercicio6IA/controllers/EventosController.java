package com.ejercicio6IA.ejercicio6IA.controllers;

import com.ejercicio6IA.ejercicio6IA.Inscripcion;
import com.ejercicio6IA.ejercicio6IA.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventosController {

    private List<Inscripcion> inscripciones = new ArrayList<>();

    @GetMapping("/formulario")
    public String mostrarFormulario(){
        return "formulario";
    }

    @PostMapping("/inscribir")
    @ResponseBody
    public Response ProcesarFormulario(@ModelAttribute Inscripcion inscripcion){
        inscripcion.setFechaRegistro(LocalDate.now());

        inscripciones.add(inscripcion);

        return new Response("Inscrito", inscripcion.getNombreParticipante(), inscripcion.getFechaRegistro());
    }
}
