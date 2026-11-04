package com.ejercicio2Ia.ejercicio2Ia.controllers;

import com.ejercicio2Ia.ejercicio2Ia.Cafe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CafeController {

    @GetMapping("/formulario")
    public String mostrarFormulario(){
        return "formularioCafe";
    }

    @PostMapping("/cafe")
    @ResponseBody
    public String procesarCafe(@ModelAttribute Cafe cafe){
        double precio = 2.0;
        double total = 0.0;
        String respuesta = "";

        total += precio * cafe.getCantidad();
        if (cafe.getCantidad() > 5){
            total -= 1;
        }
        if (cafe.getCantidad() < 0){
            return "Error";
        }

        respuesta += "Pedio de cantidad: " + cafe.getCantidad()+" del tipo " + cafe.getTipoCafe() + " Total " + total;

        return respuesta;
    }

}
