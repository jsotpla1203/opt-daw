package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/inicio")
    public String html(){
        return " <h1>Bienvenido a la aplicación</h1>";
    };

    @GetMapping("/contacto")
    public String contacto(){
        return "<title>Página de Contacto</title>" +
                "<p>Calle calle 1 23300(Jaen)</p>" +
                "<p>Email: paco@gmail.com</p>";
    };
}
