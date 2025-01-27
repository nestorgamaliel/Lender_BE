package com.lender.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Municipio {

    @Id
    @Column(name = "municipio_id") // Especifica el nombre exacto de la columna en la base de datos    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short municipioId;

    
    @Column(nullable = false, length = 30)
    private String municipio;

    @ManyToOne
    @JoinColumn(name = "departamento_ID", nullable = false)
    private Departamento departamento;

    // Getters y setters
    public Short getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(Short municipioId) {
        this.municipioId = municipioId;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
