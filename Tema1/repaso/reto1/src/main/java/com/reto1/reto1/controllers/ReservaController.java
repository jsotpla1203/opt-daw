package com.reto1.reto1.controllers;

import com.reto1.reto1.models.Obra;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class ReservaController {

    private final List<Obra> cartelera = new CopyOnWriteArrayList<>(Arrays.asList(
            new Obra(101, "La Casa de Bernarda Alba", 25.0, 10),
            new Obra(102, "Yerma", 32.0, 5),
            new Obra(103, "El Tragaluz", 18.0, 20)
    ));


    @GetMapping("/reserva")
    public String reserva(){
        return "reserva";
    }

    @PostMapping("/procesar")
    pu
}
