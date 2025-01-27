package com.lender.backend.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short personaId;

    @Column(nullable = false, length = 80)
    private String nombres;

    @Column(length = 80)
    private String apellidos;

    private LocalDate fechaNacimiento;

    @Column(length = 1)
    private Character sexo;

    @Column(length = 15)
    private String telefono;

    @Column(length = 100)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "departamento_id", referencedColumnName = "departamento_id", nullable = false) 
    private Departamento departamento;


    @ManyToOne
    @JoinColumn(name = "municipio_id", referencedColumnName = "municipio_id")
    private Municipio municipio;

    // Getters y setters
    public Short getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Short personaId) {
        this.personaId = personaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
