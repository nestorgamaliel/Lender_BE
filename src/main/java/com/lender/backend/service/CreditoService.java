package com.lender.backend.service;

import org.springframework.stereotype.Service;

import com.lender.backend.entity.Credito;
import com.lender.backend.entity.Persona;
import com.lender.backend.repository.CreditoRepository;
import com.lender.backend.repository.PersonaRepository;

@Service
public class CreditoService {

    private final CreditoRepository creditoRepository;
    private final PersonaRepository personaRepository;

    public CreditoService(CreditoRepository creditoRepository, PersonaRepository personaRepository) {
        this.creditoRepository = creditoRepository;
        this.personaRepository = personaRepository;
    }

    public Credito guardarCredito(Credito credito, Short personaId) {
        Persona persona = personaRepository.findById(personaId)
                .orElseThrow(() -> new IllegalArgumentException("Persona no encontrada con ID: " + personaId));
        
        credito.setPersona(persona);
        return creditoRepository.save(credito);
    }
}
