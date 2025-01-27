package com.lender.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lender.backend.dto.PlanPagoDTO;
import com.lender.backend.entity.PlanPago;
import com.lender.backend.service.PlanPagoService;

@RestController
@RequestMapping("/api/plan-pagos")
public class PlanPagoController {

    private final PlanPagoService planPagoService;

    public PlanPagoController(PlanPagoService planPagoService) {
        this.planPagoService = planPagoService;
    }

    @PostMapping
    public ResponseEntity<PlanPago> crearPlanPago(@RequestBody PlanPagoDTO planPagoDTO) {
        PlanPago nuevoPlanPago = planPagoService.guardarPlanPago(planPagoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPlanPago);
    }

    @GetMapping("/{creditoId}/{planPagoId}")
    public ResponseEntity<PlanPago> obtenerPlanPago(
            @PathVariable Integer creditoId,
            @PathVariable Short planPagoId) {
        return planPagoService.buscarPlanPagoPorId(creditoId, planPagoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
