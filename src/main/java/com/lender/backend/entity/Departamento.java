package com.lender.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Departamento {

    @Id
    @Column(name = "departamento_id") // Especifica el nombre exacto de la columna en la base de datos    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short departamentoId;

    @Column(nullable = false, length = 30)
    private String departamento;

    // Getters y setters
    public Short getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Short departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
