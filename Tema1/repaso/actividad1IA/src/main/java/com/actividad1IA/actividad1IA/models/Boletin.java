package com.actividad1IA.actividad1IA.models;


import java.util.ArrayList;
import java.util.List;

public class Boletin {
    private Estudiante estudiante;
    private List<Asignatura> asignaturas = new ArrayList<>();

    public Boletin() {
    }

    public Boletin(Estudiante estudiante, List<Asignatura> asignaturas) {
        this.estudiante = estudiante;
        this.asignaturas = asignaturas;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
