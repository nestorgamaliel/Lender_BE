package com.lender.backend.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PlanPagoDTO {

    private Integer creditoId;
    private Short planPagoId;
    private LocalDate fechaPago;
    private BigDecimal montoPagar;
    private BigDecimal totalPagado;
    private BigDecimal totalPendiente;

    // Getters y Setters
    public Integer getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(Integer creditoId) {
        this.creditoId = creditoId;
    }

    public Short getPlanPagoId() {
        return planPagoId;
    }

    public void setPlanPagoId(Short planPagoId) {
        this.planPagoId = planPagoId;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(BigDecimal montoPagar) {
        this.montoPagar = montoPagar;
    }

    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(BigDecimal totalPagado) {
        this.totalPagado = totalPagado;
    }

    public BigDecimal getTotalPendiente() {
        return totalPendiente;
    }

    public void setTotalPendiente(BigDecimal totalPendiente) {
        this.totalPendiente = totalPendiente;
    }
}
