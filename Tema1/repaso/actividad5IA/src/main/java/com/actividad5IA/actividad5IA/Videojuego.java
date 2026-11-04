package com.actividad5IA.actividad5IA;

public class Videojuego {
    private String titulo;
    private Integer votos;

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer votos) {
        this.titulo = titulo;
        this.votos = votos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
}
