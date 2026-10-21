package com.reto3.reto3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class JuegosController {

    @GetMapping("/juegos")
    public String tirarDados(
            @RequestParam(name = "cantidad", required = false, defaultValue = "6") Integer cantidad,
            @RequestParam(name = "caras", required = false, defaultValue = "2") Integer caras
    ){
        cantidad = Integer.parseInt(String.valueOf(cantidad));
        caras = Integer.parseInt(String.valueOf(caras));

        String mensaje = "Resultados";
        int suma = 0;
        boolean dobles = true;
        int primero = 0;



        if (cantidad < 1 || cantidad > 10){
            return "Error cantidad incorrecta";
        }

        if (caras != 4 && caras != 6 && caras != 8 &&caras != 10 &&caras != 12 && caras != 20){
            return "Error caras incorrectas";
        }

        for (int i = 0; i < cantidad; i++){
            int resultado = (int) (Math.random() * caras) + 1;


        }
        return mensaje;
    }

    @GetMapping("/moneda")
    public String caraCruz(
            @RequestParam(name = "lanzamientos") Integer lanzamientos
    ){
        String mensaje = "";

        for (int i = 0; i < lanzamientos; i++){
            int resultado = (int) (Math.random() * lanzamientos) + 1;
            if (resultado )

        }
    }
}
