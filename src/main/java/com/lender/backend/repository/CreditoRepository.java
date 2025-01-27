package com.lender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lender.backend.entity.Credito;

public interface CreditoRepository extends JpaRepository<Credito, Integer> {
}
