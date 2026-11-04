package com.actividad1IA.actividad1IA.models;

public class Estudiante {
    private String nombre;
    private  String curso;
    private String modalidad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String curso, String modalidad) {
        this.nombre = nombre;
        this.curso = curso;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
}
