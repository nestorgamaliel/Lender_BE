package com.lender.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lender.backend.dto.CreditoDTO;
import com.lender.backend.entity.Credito;
import com.lender.backend.entity.Persona;
import com.lender.backend.service.CreditoService;
import com.lender.backend.service.PersonaService;

@RestController
@RequestMapping("/api/creditos")
public class CreditoController {

    private final CreditoService creditoService;
    private final PersonaService personaService;

    public CreditoController(CreditoService creditoService, PersonaService personaService) {
        this.creditoService = creditoService;
        this.personaService = personaService;
    }

    @PostMapping
    public ResponseEntity<Credito> crearCredito(@RequestBody CreditoDTO creditoDTO) {
        // Buscar la persona por ID
        Persona persona = personaService.buscarPersonaPorId(creditoDTO.getPersonaId());
        if (persona == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        // Mapear CreditoDTO a la entidad Credito
        Credito credito = new Credito();
        credito.setPersona(persona);
        credito.setFecha(creditoDTO.getFecha());
        credito.setTasaInteres(creditoDTO.getTasaInteres());
        credito.setMontoSolicitado(creditoDTO.getMontoSolicitado());
        credito.setNumeroCuotas(creditoDTO.getNumeroCuotas());
        credito.setComisionAsistenciaFinanciera(creditoDTO.getComisionAsistenciaFinanciera());
        credito.setComisionAdministrativa(creditoDTO.getComisionAdministrativa());
        credito.setMontoColocado(creditoDTO.getMontoColocado());
        credito.setMontoIntereses(creditoDTO.getMontoIntereses());
        credito.setTotalCreditoProyectado(creditoDTO.getTotalCreditoProyectado());
        credito.setCuota(creditoDTO.getCuota());
        credito.setDiaPago(creditoDTO.getDiaPago());

        // Guardar el crédito
        Credito nuevoCredito = creditoService.guardarCredito(credito, credito.getPersona().getPersonaId());
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCredito);
    }
}
