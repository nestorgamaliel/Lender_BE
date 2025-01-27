package com.lender.backend.repository;

import com.lender.backend.entity.PlanPago;
import com.lender.backend.entity.PlanPagoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanPagoRepository extends JpaRepository<PlanPago, PlanPagoId> {
}
