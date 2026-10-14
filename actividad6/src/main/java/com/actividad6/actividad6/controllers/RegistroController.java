package com.actividad6.actividad6.controllers;

import com.actividad6.actividad6.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RegistroController {
    @GetMapping("/registro")
    public String mostrarFormulario(){
        return "formulario";
    }

    @PostMapping("/registro")
    @ResponseBody
    public String procesarFormulario(@ModelAttribute Registro registro){
        if (registro.getNombre().isEmpty()){
            return "Escribe el nombre";
        }
        if (registro.getApellido().isEmpty()){
            registro.setApellido("");
        }
        if (registro.getCorreo().isEmpty()){
            return "Escribe el correo";
        }
        if (registro.getContraseña() == null){
            Random randomNumbers = new Random();
            registro.setContraseña(randomNumbers.nextInt(999999));
            return "Contraseña "+ registro.getContraseña();
        }
        return "Nombre " + registro.getNombre();
    }
}
