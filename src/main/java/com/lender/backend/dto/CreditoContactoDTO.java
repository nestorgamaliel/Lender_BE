package com.lender.backend.dto;

public class CreditoContactoDTO {

    private Integer contactoId;
    private Integer creditoId;
    private String nombre;
    private String direccion;
    private String lugarTrabajo;
    private Long telefono;
    private Long telefonoTrabajo;

    // Getters y Setters
    public Integer getContactoId() {
        return contactoId;
    }

    public void setContactoId(Integer contactoId) {
        this.contactoId = contactoId;
    }

    public Integer getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(Integer creditoId) {
        this.creditoId = creditoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Long getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(Long telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
}
