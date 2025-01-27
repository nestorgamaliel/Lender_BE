package com.lender.backend.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditoDTO {

    @NotNull
    private Short personaId;

    @NotNull
    private LocalDate fecha;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal tasaInteres;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal montoSolicitado;

    @NotNull
    @Min(1)
    private Short numeroCuotas;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal comisionAsistenciaFinanciera;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal comisionAdministrativa;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal montoColocado;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal montoIntereses;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal totalCreditoProyectado;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal cuota;

    @NotNull
    @Min(1)
    @Max(31)
    private Short diaPago;

    // Getters y Setters

    public Short getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Short personaId) {
        this.personaId = personaId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public BigDecimal getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(BigDecimal montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public Short getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(Short numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public BigDecimal getComisionAsistenciaFinanciera() {
        return comisionAsistenciaFinanciera;
    }

    public void setComisionAsistenciaFinanciera(BigDecimal comisionAsistenciaFinanciera) {
        this.comisionAsistenciaFinanciera = comisionAsistenciaFinanciera;
    }

    public BigDecimal getComisionAdministrativa() {
        return comisionAdministrativa;
    }

    public void setComisionAdministrativa(BigDecimal comisionAdministrativa) {
        this.comisionAdministrativa = comisionAdministrativa;
    }

    public BigDecimal getMontoColocado() {
        return montoColocado;
    }

    public void setMontoColocado(BigDecimal montoColocado) {
        this.montoColocado = montoColocado;
    }

    public BigDecimal getMontoIntereses() {
        return montoIntereses;
    }

    public void setMontoIntereses(BigDecimal montoIntereses) {
        this.montoIntereses = montoIntereses;
    }

    public BigDecimal getTotalCreditoProyectado() {
        return totalCreditoProyectado;
    }

    public void setTotalCreditoProyectado(BigDecimal totalCreditoProyectado) {
        this.totalCreditoProyectado = totalCreditoProyectado;
    }

    public BigDecimal getCuota() {
        return cuota;
    }

    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }

    public Short getDiaPago() {
        return diaPago;
    }

    public void setDiaPago(Short diaPago) {
        this.diaPago = diaPago;
    }
}
