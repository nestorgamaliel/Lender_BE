package com.lender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lender.backend.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Short> {
}
