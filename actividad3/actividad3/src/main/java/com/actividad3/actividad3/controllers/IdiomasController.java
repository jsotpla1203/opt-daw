package com.actividad3.actividad3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IdiomasController {

    @GetMapping("/elegir")
    public String elegirIdioma(
            @RequestParam(name = "idioma", required = true) String idioma){
        if (idioma == null) {
            return "redirect:/english.html";
        }

        if (idioma.equals("spanish")) {
            return "redirect:/spanish.html";
        }

        if (idioma.equals("french")) {
            return "redirect:/french.html";
        }

        if (idioma.equals("english")) {
            return "redirect:/english.html";
        }

        if (idioma.equals("german")) {
            return "redirect:/german.html";
        }

        return "redirect:/english.html";
    }
}

