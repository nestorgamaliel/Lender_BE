package com.lender.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Credito_Contacto")
public class CreditoContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Contacto_id")
    private Integer contactoId;

    @ManyToOne
    @JoinColumn(name = "Credito_id", nullable = false)
    private Credito credito;

    @Column(name = "Nombre", nullable = false, length = 80)
    private String nombre;

    @Column(name = "Direccion", length = 200)
    private String direccion;

    @Column(name = "Lugar_trabajo", length = 80)
    private String lugarTrabajo;

    @Column(name = "Telefono", nullable = false)
    private Long telefono;

    @Column(name = "Telefono_trabajo")
    private Long telefonoTrabajo;

    // Getters y Setters
    public Integer getContactoId() {
        return contactoId;
    }

    public void setContactoId(Integer contactoId) {
        this.contactoId = contactoId;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
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
