package com.lender.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Credito")
public class Credito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Credito_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Persona_id", nullable = false)
    private Persona persona;

    @Column(name = "Fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "Tasa_interes", nullable = false)
    private BigDecimal tasaInteres;

    @Column(name = "Monto_Solicitado", nullable = false)
    private BigDecimal montoSolicitado;

    @Column(name = "Numero_cuotas", nullable = false)
    private Short numeroCuotas;

    @Column(name = "Comision_Asistencia_Financiera", nullable = false)
    private BigDecimal comisionAsistenciaFinanciera = BigDecimal.ZERO;

    @Column(name = "Comision_Administrativa", nullable = false)
    private BigDecimal comisionAdministrativa = BigDecimal.ZERO;

    @Column(name = "Monto_Colocado", nullable = false)
    private BigDecimal montoColocado;

    @Column(name = "Monto_Intereses", nullable = false)
    private BigDecimal montoIntereses = BigDecimal.ZERO;

    @Column(name = "Total_Credito_Proyectado", nullable = false)
    private BigDecimal totalCreditoProyectado;

    @Column(name = "Cuota", nullable = false)
    private BigDecimal cuota;

    @Column(name = "Dia_Pago", nullable = false)
    private Short diaPago = 30;

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
