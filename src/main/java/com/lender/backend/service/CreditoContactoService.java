package com.lender.backend.service;

import com.lender.backend.dto.CreditoContactoDTO;
import com.lender.backend.entity.Credito;
import com.lender.backend.entity.CreditoContacto;
import com.lender.backend.repository.CreditoContactoRepository;
import com.lender.backend.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreditoContactoService {

    @Autowired
    private CreditoContactoRepository contactoRepository;

    @Autowired
    private CreditoRepository creditoRepository;

    // Crear o actualizar contacto
    public CreditoContactoDTO save(CreditoContactoDTO dto) {
        CreditoContacto entity = toEntity(dto);
        CreditoContacto savedEntity = contactoRepository.save(entity);
        return toDTO(savedEntity);
    }

    // Obtener todos los contactos
    public List<CreditoContactoDTO> findAll() {
        return contactoRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    // Convertir de entidad a DTO
    private CreditoContactoDTO toDTO(CreditoContacto entity) {
        CreditoContactoDTO dto = new CreditoContactoDTO();
        dto.setContactoId(entity.getContactoId());
        dto.setCreditoId(entity.getCredito().getId());
        dto.setNombre(entity.getNombre());
        dto.setDireccion(entity.getDireccion());
        dto.setLugarTrabajo(entity.getLugarTrabajo());
        dto.setTelefono(entity.getTelefono());
        dto.setTelefonoTrabajo(entity.getTelefonoTrabajo());
        return dto;
    }

    // Convertir de DTO a entidad
    private CreditoContacto toEntity(CreditoContactoDTO dto) {
        CreditoContacto entity = new CreditoContacto();
        if (dto.getContactoId() != null) {
            entity.setContactoId(dto.getContactoId());
        }
        Credito credito = creditoRepository.findById(dto.getCreditoId())
                .orElseThrow(() -> new RuntimeException("Crédito no encontrado"));
        entity.setCredito(credito);
        entity.setNombre(dto.getNombre());
        entity.setDireccion(dto.getDireccion());
        entity.setLugarTrabajo(dto.getLugarTrabajo());
        entity.setTelefono(dto.getTelefono());
        entity.setTelefonoTrabajo(dto.getTelefonoTrabajo());
        return entity;
    }
}
