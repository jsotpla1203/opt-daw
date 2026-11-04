package com.ejercicio6IA.ejercicio6IA;

import java.time.LocalDate;

public class Response {
    private String estado;
    private String participante;
    private LocalDate fecha;

    public Response() {
    }

    public Response(String estado, String participante, LocalDate fecha) {
        this.estado = estado;
        this.participante = participante;
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
