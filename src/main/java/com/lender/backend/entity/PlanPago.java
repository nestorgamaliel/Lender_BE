package com.lender.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "Plan_Pago")
public class PlanPago {

    @EmbeddedId
    private PlanPagoId id;

    @Column(name = "Fecha_Pago", nullable = false)
    private LocalDate fechaPago;

    @Column(name = "Monto_Pagar", precision = 9, scale = 2)
    private BigDecimal montoPagar;

    @Column(name = "Total_Pagado", precision = 9, scale = 2, nullable = false)
    private BigDecimal totalPagado = BigDecimal.ZERO;

    @Column(name = "Total_pendiente", precision = 9, scale = 2)
    private BigDecimal totalPendiente;

    @MapsId("creditoId") // Vincula el campo de la clave primaria al ManyToOne
    @ManyToOne
    @JoinColumn(name = "Credito_id", referencedColumnName = "Credito_id")
    private Credito credito;

    // Getters y Setters
    public PlanPagoId getId() {
        return id;
    }

    public void setId(PlanPagoId id) {
        this.id = id;
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

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}
