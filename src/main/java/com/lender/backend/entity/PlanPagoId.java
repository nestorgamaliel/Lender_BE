package com.lender.backend.entity;


import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;

public class PlanPagoId implements Serializable {

    @Column(name = "Credito_id", nullable = false)
    private Integer creditoId;

    @Column(name = "Plan_Pago_id", nullable = false)
    private Short planPagoId;

    public PlanPagoId() {}

    public PlanPagoId(Integer creditoId, Short planPagoId) {
        this.creditoId = creditoId;
        this.planPagoId = planPagoId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanPagoId that = (PlanPagoId) o;
        return Objects.equals(creditoId, that.creditoId) && Objects.equals(planPagoId, that.planPagoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditoId, planPagoId);
    }
}
