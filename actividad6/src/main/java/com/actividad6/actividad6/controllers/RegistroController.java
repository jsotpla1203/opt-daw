package com.actividad6.actividad6.controllers;

import com.actividad6.actividad6.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class RegistroController {
    @GetMapping("/registro")
    public String mostrarFormulario(){
        return "formulario";
    }

    @PostMapping("/registro")
    @ResponseBody
    public String procesarFormulario(@ModelAttribute Registro registro, Map map){
        if (registro.getNombre().isEmpty()){
            return "Escribe el nombre";
        }
        if (registro.getApellido().isEmpty()){
            registro.setApellido("");
        }
        if (registro.getCorreo().isEmpty()){
            return "Escribe el correo";
        }

        Boolean isGenerated = false;
        if (registro.getContraseña().length() < 6){
            isGenerated = true;

            if (registro.getContraseña().isEmpty()){
                Random randomNumbers = new Random();
                registro.setContraseña(String.format("%06d", randomNumbers.nextInt(999999)));
            }

            registro.setContraseña(String.format("%06d", Integer.parseInt(registro.getContraseña())));
        }
        Map<String, String> contraseña = new HashMap<>();
        contraseña.put(registro.getCorreo(), registro.getContraseña());




        return "Nombre; " + registro.getNombre() + " Apellido; " + registro.getApellido() + " Correo; " + registro.getCorreo() + " Contraseña generada; " + contraseña;

    }
}
