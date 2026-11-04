package com.actividad1IA.actividad1IA.models;

public class RespuestaBoletin {
    private String alumno;
    private Double notaMedia;
    private Integer asignaturasTotales;
    private Estado estado;

    public RespuestaBoletin() {
    }

    public RespuestaBoletin(String alumno, Double notaMedia, Integer asignaturasTotales, Estado estado) {
        this.alumno = alumno;
        this.notaMedia = notaMedia;
        this.asignaturasTotales = asignaturasTotales;
        this.estado = estado;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public Integer getAsignaturasTotales() {
        return asignaturasTotales;
    }

    public void setAsignaturasTotales(Integer asignaturasTotales) {
        this.asignaturasTotales = asignaturasTotales;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
