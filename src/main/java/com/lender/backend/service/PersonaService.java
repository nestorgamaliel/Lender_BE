package com.lender.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lender.backend.entity.Persona;
import com.lender.backend.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    // Guardar una nueva Persona
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    // Obtener una Persona por su ID
    public Optional<Persona> getPersonaById(Short id) {
        return personaRepository.findById(id);
    }

    // Eliminar una Persona por su ID
    public void deletePersona(Short id) {
        personaRepository.deleteById(id);
    }

    public Persona buscarPersonaPorId(Short id) {
        return personaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada con ID: " + id));
    }
}
