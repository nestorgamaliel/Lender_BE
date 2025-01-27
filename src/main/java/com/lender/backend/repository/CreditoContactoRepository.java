package com.lender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lender.backend.entity.CreditoContacto;

@Repository
public interface CreditoContactoRepository extends JpaRepository<CreditoContacto, Integer> {
}
