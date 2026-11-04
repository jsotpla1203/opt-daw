package com.actividad6.actividad6.model;

public class Registro {
    private String nombre;
    private String apellidos;
    private String correo;
    private String password;
    private String mensaje;
    private Boolean exito;

    public Registro() {
    }

    public Registro(Boolean exito, String mensaje) {
        this.exito = exito;
        this.mensaje = mensaje;
    }

    public Registro(Boolean exito, String mensaje, String nombre, String apellidos, String correo, String password) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getExito() {
        return exito;
    }

    public void setExito(Boolean exito) {
        this.exito = exito;
    }
}
