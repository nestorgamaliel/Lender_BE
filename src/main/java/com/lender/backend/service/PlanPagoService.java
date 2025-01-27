package com.lender.backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lender.backend.dto.PlanPagoDTO;
import com.lender.backend.entity.Credito;
import com.lender.backend.entity.PlanPago;
import com.lender.backend.entity.PlanPagoId;
import com.lender.backend.repository.CreditoRepository;
import com.lender.backend.repository.PlanPagoRepository;

@Service
public class PlanPagoService {

    private final PlanPagoRepository planPagoRepository;
    private final CreditoRepository creditoRepository;

    public PlanPagoService(PlanPagoRepository planPagoRepository, CreditoRepository creditoRepository) {
        this.planPagoRepository = planPagoRepository;
        this.creditoRepository = creditoRepository;
    }

    @Transactional
    public PlanPago guardarPlanPago(PlanPagoDTO planPagoDTO) {
        // Verificar que el crédito existe
        Credito credito = creditoRepository.findById(planPagoDTO.getCreditoId())
            .orElseThrow(() -> new RuntimeException("Crédito no encontrado para ID: " + planPagoDTO.getCreditoId()));

        if (planPagoDTO.getPlanPagoId() == null || planPagoDTO.getCreditoId() == null ) {
            throw new IllegalArgumentException("El crédito asociado no puede ser nulo");            
        }
            
        // Crear el objeto PlanPago con su clave primaria compuesta
        PlanPago planPago = new PlanPago();
        planPago.setId(new PlanPagoId(planPagoDTO.getCreditoId(), planPagoDTO.getPlanPagoId()));
        planPago.setCredito(credito); // Asocia el crédito existente
        planPago.setFechaPago(planPagoDTO.getFechaPago());
        planPago.setMontoPagar(planPagoDTO.getMontoPagar());
        planPago.setTotalPagado(planPagoDTO.getTotalPagado());
        planPago.setTotalPendiente(planPagoDTO.getTotalPendiente());

        // Guardar el PlanPago en la base de datos
        return planPagoRepository.save(planPago);
    }

    public Optional<PlanPago> buscarPlanPagoPorId(Integer creditoId, Short planPagoId) {
        return planPagoRepository.findById(new PlanPagoId(creditoId, planPagoId));
    }
}
