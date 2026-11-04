package com.actividad6.actividad6.controllers;

import com.actividad6.actividad6.model.Registro;
import com.actividad6.actividad6.model.RespuestaRegistro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegistroController {

    private Map<String, String> baseDeDatos = new HashMap<>();
    public RegistroController() {
        baseDeDatos.put("ana@example.com", "246810");
        baseDeDatos.put("luis@example.com", "clave123");
    }

    @GetMapping("/registro")
    public String mostrarFormulario(){
        return "registro";
    }

    @PostMapping("/registro")
    @ResponseBody
    public RespuestaRegistro respuestaRegistro(@ModelAttribute Registro registro){

        if (registro.getNombre() == null || registro.getNombre().isBlank() || registro.getCorreo() == null || registro.getCorreo().isBlank()){
            return new RespuestaRegistro(false "")
        }

    }
}
