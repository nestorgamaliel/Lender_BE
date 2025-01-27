package com.lender.backend.dto;

import java.time.LocalDate;

public class ProrrogaDTO {

    private Short prorrogaId;
    private Integer creditoId; // Usamos solo el ID del crédito en lugar de la entidad completa
    private LocalDate fechaPagoOriginal;
    private LocalDate fechaPagoSolicitada;

    // Getters y Setters
    public Short getProrrogaId() {
        return prorrogaId;
    }

    public void setProrrogaId(Short prorrogaId) {
        this.prorrogaId = prorrogaId;
    }

    public Integer getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(Integer creditoId) {
        this.creditoId = creditoId;
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
