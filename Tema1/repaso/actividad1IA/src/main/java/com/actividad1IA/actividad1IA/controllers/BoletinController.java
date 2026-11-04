package com.actividad1IA.actividad1IA.controllers;

import com.actividad1IA.actividad1IA.models.Asignatura;
import com.actividad1IA.actividad1IA.models.Boletin;
import com.actividad1IA.actividad1IA.models.Estado;
import com.actividad1IA.actividad1IA.models.RespuestaBoletin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoletinController {

    @PostMapping("/boletin")
    public RespuestaBoletin respuestaBoletin(@RequestBody Boletin boletin){
        double media = 0;
        double sumaNotas = 0;
        int totales = 0;

        for (Asignatura asignatura : boletin.getAsignaturas()){
            sumaNotas += asignatura.getNota();
            totales++;
        }

        media = sumaNotas / boletin.getAsignaturas().size();

        Estado estadoFinal;
        if (media < 5){
            estadoFinal = Estado.SUSPENSO;
        }
        else {
            estadoFinal = Estado.APROBADO;
        }

        return new RespuestaBoletin(
                boletin.getEstudiante().getNombre(),
                media,
                totales,
                estadoFinal
        );
    }
};