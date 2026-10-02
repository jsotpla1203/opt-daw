package com.actividad3.actividad3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IdiomasController {

    @GetMapping("/inicio")
    public String idioma(
            @RequestParam(name = "idioma") String name){
        if (name.equals("Español")){
            
        }
        return name;
    }
}

