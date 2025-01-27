package com.lender.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lender.backend.entity.Pago;

public interface PagoRepository extends JpaRepository<Pago, Short> {
    // Métodos adicionales si necesitas buscar por Credito u otros criterios
}
