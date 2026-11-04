package com.actividad5IA.actividad5IA.controllers;

public class VideojuegoResponse {
    private String titulo;
    private Integer votos;

    public VideojuegoResponse() {
    }

    public VideojuegoResponse(String titulo, Integer votos) {
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
