package com.lender.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lender.backend.dto.CreditoContactoDTO;
import com.lender.backend.service.CreditoContactoService;

@RestController
@RequestMapping("/api/credito-contacto")
public class CreditoContactoController {

    @Autowired
    private CreditoContactoService contactoService;

    @PostMapping
    public CreditoContactoDTO createOrUpdate(@RequestBody CreditoContactoDTO dto) {
        return contactoService.save(dto);
    }

    @GetMapping
    public List<CreditoContactoDTO> getAll() {
        return contactoService.findAll();
    }
}
