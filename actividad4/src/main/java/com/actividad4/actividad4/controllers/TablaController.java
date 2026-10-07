package com.actividad4.actividad4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablaController {

    @GetMapping("/tabla")
    public String tabla(@RequestParam(name = "filas", required = true)){

    }
}
