package com.lender.backend.controller;

import com.lender.backend.dto.PagoDTO;
import com.lender.backend.entity.Pago;
import com.lender.backend.service.PagoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public ResponseEntity<Pago> crearPago(@RequestBody PagoDTO pagoDTO) {
        Pago nuevoPago = pagoService.guardarPago(pagoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPago);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pago> obtenerPago(@PathVariable Short id) {
        return pagoService.buscarPagoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Pago>> listarPagos() {
        List<Pago> pagos = pagoService.listarPagos();
        return ResponseEntity.ok(pagos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPago(@PathVariable Short id) {
        pagoService.eliminarPago(id);
        return ResponseEntity.noContent().build();
    }
}
