package com.ejercicio2Ia.ejercicio2Ia;

public class Cafe {
    private String tipoCafe;
    private Integer cantidad;

    public Cafe() {
    }

    public Cafe(String tipoCafe, Integer cantidad) {
        this.tipoCafe = tipoCafe;
        this.cantidad = cantidad;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
