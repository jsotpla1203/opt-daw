package com.actividad6.actividad6.model;

public class RespuestaRegistro {
    private String nombreCompleto;
    private String correo;
    private  String password;


    public RespuestaRegistro() {
    }

    public RespuestaRegistro(String nombreCompleto, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
    }

    public RespuestaRegistro(String nombreCompleto, String correo, String password) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
