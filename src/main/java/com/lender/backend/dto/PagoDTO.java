package com.lender.backend.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoDTO {

    private Short id;
    private Integer creditoId;
    private LocalDate fecha;
    private BigDecimal monto;

    // Getters y Setters
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(Integer creditoId) {
        this.creditoId = creditoId;
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
