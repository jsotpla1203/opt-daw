package com.ejercicio3Ia.ejercicio3Ia;

public class ReturnMascota {
    private String estado;
    private String mascota;


    public ReturnMascota() {
    }

    public ReturnMascota(String estado, String mascota) {
        this.estado = estado;
        this.mascota = mascota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }
}
