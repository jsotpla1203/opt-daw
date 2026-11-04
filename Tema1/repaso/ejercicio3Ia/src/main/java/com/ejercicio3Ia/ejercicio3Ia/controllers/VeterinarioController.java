package com.ejercicio3Ia.ejercicio3Ia.controllers;

import com.ejercicio3Ia.ejercicio3Ia.Mascota;
import com.ejercicio3Ia.ejercicio3Ia.ReturnMascota;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VeterinarioController {
    private List<Mascota> mascotas;

    @GetMapping("/registro")
    public String mostrarFormulario(){
        return "formVet";
    }

    public VeterinarioController(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ReturnMascota respuestaMascota(@ModelAttribute Mascota mascota){
        mascotas.add(mascota);

        return new ReturnMascota(
                "Guardado",
                mascota.getNombre()
        );
    }
}
