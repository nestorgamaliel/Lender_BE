package com.lender.backend;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.lender.backend.entity.Departamento;
import com.lender.backend.entity.Municipio;
import com.lender.backend.entity.Persona;
import com.lender.backend.repository.PersonaRepository;

@DataJpaTest // Proporciona una configuración mínima para probar JPA
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // Evita usar una base de datos en memoria.
public class PersonaRepositoryTest {

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    public void testSaveAndRetrievePersona() {

        Departamento departamento = new Departamento();
        departamento.setDepartamentoId((short)1);
        
        Municipio municipio = new Municipio();
        municipio.setMunicipioId((short)1);
        municipio.setDepartamento(departamento);

        // Crear una nueva instancia de Persona
        Persona persona = new Persona();
        persona.setNombres("Juan");
        persona.setApellidos("Pérez");
        persona.setFechaNacimiento(LocalDate.of(1990, 1, 1));
        persona.setSexo('M');
        persona.setTelefono("12345678");
        persona.setDireccion("Calle Falsa 123");
        persona.setDepartamento(departamento);
        persona.setMunicipio(municipio);

        // Guardar la persona en la base de datos
        Persona savedPersona = personaRepository.save(persona);

        // Recuperar la persona por ID
        Persona retrievedPersona = personaRepository.findById(savedPersona.getPersonaId()).orElse(null);

        // Verificar que los datos sean correctos
        assertNotNull(retrievedPersona, "La persona no fue encontrada");
        assertEquals("Juan", retrievedPersona.getNombres(), "El nombre no coincide");
        assertEquals("Pérez", retrievedPersona.getApellidos(), "El apellido no coincide");
    }
}
