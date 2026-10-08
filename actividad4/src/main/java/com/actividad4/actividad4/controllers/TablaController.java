package com.actividad4.actividad4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablaController {

    @GetMapping("/tabla")
    public String tabla(
            @RequestParam(name = "filas") String filas,
            @RequestParam(name = "columnas") String columnas
    ) {

        int num_filas = 1;
        int num_columnas = 1;
        String html;

        try {
            if (filas != null || columnas != null){
                num_filas = Integer.parseInt(filas);
                num_columnas = Integer.parseInt(columnas);
            }
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        if (num_filas > 20){
            num_filas = 20;
        }
        if (num_filas < 1){
            num_filas = 1;
        }
        if (num_columnas > 20){
            num_columnas = 20;
        }
        if (num_columnas < 1){
            num_columnas = 1;
        }

        html = "<table border = 1><tr>";
        for (int i = 1; i <= num_filas; i++){
            html += "<th>Fila número "+ i + " </th>";
            for (int j = 1; j <= num_columnas; j++){
                html += "<td>" + j + "</td>";
            }
            html +="</tr>";
        }
        html += "</table>";
        return html;
    }
}