package com.reto2.reto2;

public class Prestamo {
    private Integer libroId;
    private String nombreSocio;
    private Integer diasPrestamo;
    private Boolean carnetPremium;

    public Prestamo() {
    }

    public Prestamo(Integer libroId, Integer diasPrestamo, Boolean carnetPremium, String nombreSocio) {
        this.libroId = libroId;
        this.diasPrestamo = diasPrestamo;
        this.carnetPremium = carnetPremium;
        this.nombreSocio = nombreSocio;
    }

    public Boolean getCarnetPremium() {
        return carnetPremium;
    }

    public void setCarnetPremium(Boolean carnetPremium) {
        this.carnetPremium = carnetPremium;
    }

    public Integer getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(Integer diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public Integer getLibroId() {
        return libroId;
    }

    public void setLibroId(Integer libroId) {
        this.libroId = libroId;
    }
}
