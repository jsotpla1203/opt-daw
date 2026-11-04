package com.actividad7IA.actividad7IA.controllers;

import com.actividad7IA.actividad7IA.Habitacion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReservasController {

    private List<Habitacion> habitaciones = new ArrayList<>();


    public ReservasController(){
        habitaciones.add(new Habitacion(1, "Doble", 83.0));
        habitaciones.add(new Habitacion(2, "Individual", 123.0));
        habitaciones.add(new Habitacion(3, "Individual", 32.3));
        habitaciones.add(new Habitacion(4, "Doble", 92.32));
    }

    @GetMapping("/habitaciones")
    public List<Habitacion> verHabitaciones(@RequestParam String tipo,
                                            @RequestParam Double precioMax){
        List<Habitacion> habitacionReserva = new ArrayList<>();

        for (Habitacion habitacion : habitaciones){
            if (tipo.equalsIgnoreCase(habitacion.getTipo()) && habitacion.getPrecio() <= precioMax){
                habitacionReserva.add(new Habitacion(habitacion.getNumero(), habitacion.getTipo(), habitacion.getPrecio()));
            }
        }

        return habitacionReserva;
    }

}
