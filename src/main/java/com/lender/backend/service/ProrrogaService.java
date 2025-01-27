package com.lender.backend.service;

import com.lender.backend.dto.ProrrogaDTO;
import com.lender.backend.entity.Credito;
import com.lender.backend.entity.Prorroga;
import com.lender.backend.repository.CreditoRepository;
import com.lender.backend.repository.ProrrogaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProrrogaService {

    private final ProrrogaRepository prorrogaRepository;
    private final CreditoRepository creditoRepository;

    public ProrrogaService(ProrrogaRepository prorrogaRepository, CreditoRepository creditoRepository) {
        this.prorrogaRepository = prorrogaRepository;
        this.creditoRepository = creditoRepository;
    }

    public ProrrogaDTO guardarProrroga(ProrrogaDTO prorrogaDTO) {
        Prorroga prorroga = convertirDTOAEntidad(prorrogaDTO); // Convierte el DTO a la entidad
        Prorroga prorrogaGuardada = prorrogaRepository.save(prorroga); // Guarda la entidad
        return convertirEntidadADTO(prorrogaGuardada); // Convierte la entidad guardada de nuevo a DTO
    }

    public List<ProrrogaDTO> listarProrrogas() {
        return prorrogaRepository.findAll().stream()
                .map(this::convertirEntidadADTO)
                .collect(Collectors.toList());
    }

    public Optional<ProrrogaDTO> buscarProrrogaPorId(Short prorrogaId) {
        return prorrogaRepository.findById(prorrogaId)
                .map(this::convertirEntidadADTO);
    }

    public void eliminarProrroga(Short prorrogaId) {
        prorrogaRepository.deleteById(prorrogaId);
    }

    // Métodos de conversión
    private Prorroga convertirDTOAEntidad(ProrrogaDTO dto) {
        Prorroga prorroga = new Prorroga();
        prorroga.setProrrogaId(dto.getProrrogaId());
        prorroga.setFechaPagoOriginal(dto.getFechaPagoOriginal());
        prorroga.setFechaPagoSolicitada(dto.getFechaPagoSolicitada());
        Credito credito = creditoRepository.findById(dto.getCreditoId())
                .orElseThrow(() -> new IllegalArgumentException("Crédito no encontrado"));
        prorroga.setCredito(credito);
        return prorroga;
    }

    private ProrrogaDTO convertirEntidadADTO(Prorroga prorroga) {
        ProrrogaDTO dto = new ProrrogaDTO();
        dto.setProrrogaId(prorroga.getProrrogaId());
        dto.setCreditoId(prorroga.getCredito().getId());
        dto.setFechaPagoOriginal(prorroga.getFechaPagoOriginal());
        dto.setFechaPagoSolicitada(prorroga.getFechaPagoSolicitada());
        return dto;
    }
}
