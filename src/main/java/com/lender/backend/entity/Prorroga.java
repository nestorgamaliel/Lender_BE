package com.lender.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Prorroga")
public class Prorroga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Prorroga_ID", nullable = false)
    private Short prorrogaId;

    @ManyToOne
    @JoinColumn(name = "Credito_ID", nullable = false)
    private Credito credito;

    @Column(name = "Fecha_pago_original", nullable = false)
    private LocalDate fechaPagoOriginal;

    @Column(name = "Fecha_Pago_Solicitada")
    private LocalDate fechaPagoSolicitada;

    // Getters y Setters
    public Short getProrrogaId() {
        return prorrogaId;
    }

    public void setProrrogaId(Short prorrogaId) {
        this.prorrogaId = prorrogaId;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public LocalDate getFechaPagoOriginal() {
        return fechaPagoOriginal;
    }

    public void setFechaPagoOriginal(LocalDate fechaPagoOriginal) {
        this.fechaPagoOriginal = fechaPagoOriginal;
    }

    public LocalDate getFechaPagoSolicitada() {
        return fechaPagoSolicitada;
    }

    public void setFechaPagoSolicitada(LocalDate fechaPagoSolicitada) {
        this.fechaPagoSolicitada = fechaPagoSolicitada;
    }
}
