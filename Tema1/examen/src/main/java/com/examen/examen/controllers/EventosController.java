package com.examen.examen.controllers;

import com.examen.examen.Categoria;
import com.examen.examen.Evento;
import com.examen.examen.MensajeError;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventosController {
    private List<Evento> eventos = new ArrayList<>();
    private Long siguienteId = 1L;

    public EventosController() {
        eventos.add(new Evento(siguienteId, "Concierto", LocalDate.now().plusDays(30), "Auditorio", Categoria.MUSICA, 200));
        eventos.add(new Evento(siguienteId, "Teatro", LocalDate.now().plusDays(23), "Teatro", Categoria.CULTURA, 100));
        eventos.add(new Evento(siguienteId, "Partido", LocalDate.now().plusDays(15), "Polideportivo", Categoria.DEPORTE, 300));
    }


    @GetMapping("/eventos")
    @ResponseBody
    public String mostrarEventos(){
        String html = "";

        for (Evento e : eventos){
            html += "<table>" +
                    "<tr><th>ID</th>" +
                    "<th>Nombre</th>" +
                    "<th>Fecha</th>" +
                    "<th>Ubicacion</th>" +
                    "<th>Categoria</th>" +
                    "<th>Plazas Disponibles</th></tr>" +
                    "<tr><th>"+e.getId()+"</th>" +
                    "<th>"+e.getNombre()+"</th>" +
                    "<th>"+e.getFecha()+"</th>" +
                    "<th>"+e.getUbicacion()+"</th>" +
                    "<th>"+e.getCategoria()+"</th>" +
                    "<th>"+e.getPlazasDisponibles()+"</th></tr></table>";

            if (eventos.isEmpty()){
                return "No hay eventos";
            }
        }

        return html;
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(){
        return "nuevo";
    }

    @PostMapping("/eventos")
    @ResponseBody
    public String nuevoEvento(@ModelAttribute Evento evento){
        if (evento.getNombre().isEmpty() || evento.getNombre().isBlank() || evento.getNombre().length() < 3){
            return ("Error, el nombre no tiene los suficientes caracteres");
        }
        if (evento.getFecha() == null || evento.getFecha().isBefore(LocalDate.now())){
            return ("Error, la fecha es nula o anterior a hoy");
        }
        if (evento.getUbicacion().isBlank() || evento.getUbicacion().isEmpty()){
            return ("Error, la ubicacion es nula");
        }
        if (evento.getPlazasDisponibles() == null || evento.getPlazasDisponibles() > 500 || evento.getPlazasDisponibles() < 1){
            return ("Error, no has puesto plazas suficientes o hay más de lo normal");
        }
        evento.setId(siguienteId ++);
        eventos.add(new Evento(siguienteId, evento.getNombre(), evento.getFecha(),  evento.getUbicacion(), evento.getCategoria(), evento.getPlazasDisponibles()));

        return "Id del evento "+ evento.getId()+ "<p> Nombre del evento " + evento.getNombre() + "<p> Fecha del evento" + evento.getFecha() + "<p> Ubicacion " + evento.getUbicacion() + "<p> Categoria " + evento.getCategoria() + "<p> Plazas " + evento.getPlazasDisponibles();
    }

    @GetMapping("/api/evento")
    @ResponseBody
    public Object devolverEvento(@RequestParam Long id){
        for (Evento e : eventos){
            if (e.getId() != id){
                return new MensajeError("Error no se ha encontrado un evento con ese id");
            }
        }

        return eventos;
    }

    @GetMapping("/eventos/eliminar")
    public Object eliminarEvento(@RequestParam Long id){
        for (Evento e : eventos){
            if (e.getId() != id){
                return "<a href>/eventos";
            }
        }
        return eventos;
    }




}
