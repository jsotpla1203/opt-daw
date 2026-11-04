package com.reto2.reto2.models;

public class RespuestaLibros {
    private Integer id;
    private String titulo;
    private String autor;
    private String categoria;
    private Integer ejemplaresDisponibles;
    private String mensaje;

    public RespuestaLibros() {
    }

    public RespuestaLibros(Libro libro) {
        this.id = libro.getId();
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.categoria = libro.getCategoria();
        this.ejemplaresDisponibles = libro.getEjemplaresDisponibles();
    }

    public RespuestaLibros(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public String getMensaje() {
        return mensaje;
    }
}
