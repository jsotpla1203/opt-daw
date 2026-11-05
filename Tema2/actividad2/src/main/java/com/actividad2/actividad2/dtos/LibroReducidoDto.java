package com.actividad2.actividad2.dtos;

public class LibroReducidoDto {
    private Long id;
    private String titulo;

    public LibroReducidoDto() {
    }

    public LibroReducidoDto(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
