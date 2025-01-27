package com.lender.backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "Pago_Id", nullable = false)
    private Short id;

    @ManyToOne
    @JoinColumn(name = "Credito_ID", nullable = false, referencedColumnName = "Credito_id")
    private Credito credito;

    @Column(name = "Fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "Monto", nullable = false, precision = 9, scale = 2)
    private BigDecimal monto;

    // Getters y Setters
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
}
