package com.actividad7IA.actividad7IA;

public class Habitacion {
    private Integer numero;
    private String tipo;
    private Double precio;

    public Habitacion() {
    }

    public Habitacion(Integer numero, String tipo, Double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
