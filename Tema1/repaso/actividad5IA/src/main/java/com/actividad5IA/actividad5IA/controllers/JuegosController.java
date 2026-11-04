package com.actividad5IA.actividad5IA.controllers;

import com.actividad5IA.actividad5IA.Videojuego;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JuegosController {
    private List<Videojuego> videojuegos;

    public JuegosController() {
        videojuegos = new ArrayList<>();
        videojuegos.add(new Videojuego("Zelda", 0));
        videojuegos.add(new Videojuego("Mario", 0));
        videojuegos.add(new Videojuego("GTA", 0));
    }

    @GetMapping("/votar")
    public VideojuegoResponse votar(@RequestParam String titulo){
        String tituloJuego = "";
        int votosJuego = 0;

        for (Videojuego juego : videojuegos){
            if (titulo.equals(juego.getTitulo())){
                juego.setVotos(juego.getVotos() + 1);
                tituloJuego = juego.getTitulo();
                votosJuego = juego.getVotos();
                break;
            }
        }

        return new VideojuegoResponse(tituloJuego, votosJuego);
    }
}
