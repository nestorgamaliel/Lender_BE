package com.lender.backend.controller;

import com.lender.backend.dto.ProrrogaDTO;
import com.lender.backend.service.ProrrogaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prorroga")
public class ProrrogaController {

    private final ProrrogaService prorrogaService;

    public ProrrogaController(ProrrogaService prorrogaService) {
        this.prorrogaService = prorrogaService;
    }

    @PostMapping
    public ResponseEntity<ProrrogaDTO> crearProrroga(@RequestBody ProrrogaDTO prorrogaDTO) {
        ProrrogaDTO nuevaProrroga = prorrogaService.guardarProrroga(prorrogaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaProrroga);
    }

    @GetMapping
    public ResponseEntity<List<ProrrogaDTO>> listarProrrogas() {
        return ResponseEntity.ok(prorrogaService.listarProrrogas());
    }

    @GetMapping("/{prorrogaId}")
    public ResponseEntity<ProrrogaDTO> obtenerProrroga(@PathVariable Short prorrogaId) {
        return prorrogaService.buscarProrrogaPorId(prorrogaId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{prorrogaId}")
    public ResponseEntity<Void> eliminarProrroga(@PathVariable Short prorrogaId) {
        prorrogaService.eliminarProrroga(prorrogaId);
        return ResponseEntity.noContent().build();
    }
}
