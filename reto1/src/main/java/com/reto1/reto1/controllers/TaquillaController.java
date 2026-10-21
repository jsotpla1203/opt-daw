package com.reto1.reto1.controllers;

import com.reto1.reto1.Compra;
import com.reto1.reto1.Obra;
import com.reto1.reto1.Respuesta;
import com.reto1.reto1.enums.Estado;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaquillaController {

    Obra[] obras ={
            new Obra(101, "La Casa de Bernarda Alba", 25.0, 10),
            new Obra(102, "Yerma", 32.0, 5),
            new Obra(103, "El Tragaluz", 18.0, 20)
    };

    @GetMapping("/reserva")
    public String formularioReserva(){
        return "reserva";
    }

    @GetMapping("/cartelera")
    @ResponseBody
    public List<Obra> consultarCartelera(@RequestParam(name = "precioMax", required = false) Double precioMax,
                                         @RequestParam(name = "soloDisponible", required = false) Boolean soloDisponible )
    {
        List<Obra> obraCartelera = new ArrayList<>();

        if (precioMax != null && soloDisponible != null){

            for (Obra obra : obras){
                if (obra.getPrecio() <= precioMax && obra.getAsientos() > 0){
                    obraCartelera.add(obra);
                }
            }

        } else if (precioMax != null) {

            for (Obra obra : obras){
                if (obra.getPrecio() <= precioMax){
                    obraCartelera.add(obra);
                }
            }

        } else if (soloDisponible != null) {

            for (Obra obra: obras){
                if (obra.getAsientos() > 0){
                    obraCartelera.add(obra);
                }
            }

        }
        else {
            for (Obra obra : obras){
                obraCartelera.add(obra);
            }
        }

        return obraCartelera;
    }

    @PostMapping("/compra")
    @ResponseBody
    public Respuesta validarCompra(@ModelAttribute Compra compra){

        Obra obra = null;

        for (Obra obra1 : obras){
            if (obra.getId() == compra.getEventoId()){
                obra = obra1;
            }
        }

        if (obra == null){
            return new Respuesta("ID incorrecto", Estado.RECHAZADO);
        }

        if (compra.getCantidad() > obra.getAsientos()){
            return new Respuesta("Aforo insuficiente", obra.getAsientos(), Estado.RECHAZADO);
        }

        double precioUnitario = compra.getTipoEntrada().equals("vip") ? obra.getPrecio() * 1.2 : obra.getPrecio();
        double importe = precioUnitario * compra.getCantidad();
        double descuento = 0;
        double importeTemp = importe;

        if (compra.getCantidad() >= 4){
            descuento = importeTemp * 0.1;
            importeTemp -= descuento;
        }

        if (compra.getCodigoCupon().equals("DESCUENTO15")){
            descuento += importeTemp * 0.15;
            importeTemp -= descuento;
        }

        return new Respuesta(
                compra.getNombreCliente(),
                compra.getCantidad(),
                precioUnitario,
                importe,
                descuento,
                importeTemp,
                Estado.CONFIRMADO
        );
    }
}
