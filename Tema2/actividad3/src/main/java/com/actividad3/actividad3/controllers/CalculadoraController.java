package com.actividad3.actividad3.controllers;

import com.actividad3.actividad3.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @GetMapping("/calculadora/{operacion}/{numero1}/{numero2}")
    public ResponseEntity<?> calcular(@PathVariable String operacion,
                                    @PathVariable Double numero1,
                                    @PathVariable Double numero2){
        return ResponseEntity.ok(calculadoraService.calcular(operacion, numero1, numero2));
    }

}
