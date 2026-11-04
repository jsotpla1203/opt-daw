package com.ejercicio6IA.ejercicio6IA;

import java.time.LocalDate;

public class Inscripcion {
    private String nombreParticipante;
    private Integer taller;
    private LocalDate fechaRegistro;

    public Inscripcion() {
    }

    public Inscripcion(String nombreParticipante, Integer taller, LocalDate fechaRegistro) {
        this.nombreParticipante = nombreParticipante;
        this.taller = taller;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

    public Integer getTaller() {
        return taller;
    }

    public void setTaller(Integer taller) {
        this.taller = taller;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
