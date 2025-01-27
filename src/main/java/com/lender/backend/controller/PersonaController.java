package com.lender.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lender.backend.entity.Persona;
import com.lender.backend.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // Endpoint para guardar una nueva Persona
    @PostMapping
    public ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        Persona savedPersona = personaService.savePersona(persona);
        return new ResponseEntity<>(savedPersona, HttpStatus.CREATED);
    }

    // Endpoint para obtener una Persona por ID
    @GetMapping("/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Short id) {
        Optional<Persona> persona = personaService.getPersonaById(id);
        return persona.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para eliminar una Persona por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Short id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
