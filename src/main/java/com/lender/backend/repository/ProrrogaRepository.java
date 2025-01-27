package com.lender.backend.repository;

import com.lender.backend.entity.Prorroga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProrrogaRepository extends JpaRepository<Prorroga, Short> {
}
