package com.lender.backend.service;

import com.lender.backend.dto.PagoDTO;
import com.lender.backend.entity.Credito;
import com.lender.backend.entity.Pago;
import com.lender.backend.repository.CreditoRepository;
import com.lender.backend.repository.PagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    private final PagoRepository pagoRepository;
    private final CreditoRepository creditoRepository;

    public PagoService(PagoRepository pagoRepository, CreditoRepository creditoRepository) {
        this.pagoRepository = pagoRepository;
        this.creditoRepository = creditoRepository;
    }

    public Pago guardarPago(PagoDTO pagoDTO) {
        Credito credito = creditoRepository.findById(pagoDTO.getCreditoId())
                .orElseThrow(() -> new RuntimeException("Crédito no encontrado"));

        Pago pago = new Pago();
        pago.setId(pagoDTO.getId());
        pago.setCredito(credito);
        pago.setFecha(pagoDTO.getFecha());
        pago.setMonto(pagoDTO.getMonto());

        return pagoRepository.save(pago);
    }

    public Optional<Pago> buscarPagoPorId(Short id) {
        return pagoRepository.findById(id);
    }

    public List<Pago> listarPagos() {
        return pagoRepository.findAll();
    }

    public void eliminarPago(Short id) {
        pagoRepository.deleteById(id);
    }
}
