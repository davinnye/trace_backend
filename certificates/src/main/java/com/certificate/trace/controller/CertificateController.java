package com.certificate.trace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.certificate.trace.model.Certificate;
import com.certificate.trace.service.CertificateService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("certificates")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @Operation(summary = "Registrar novo certificado" )
    @PostMapping
    public Certificate register(@RequestParam String cpf) {
        return service.registerCertificate(cpf);
    }

    @Operation(summary = "Validar código de certificado" )
    @GetMapping("/validate")
    public Optional<Certificate> validateCertificate(
        @RequestParam(required = true) String code) {
        return service.validateCertificateByCode(code);
    }

    @Operation(summary = "Buscar todos os certificados com base no cpf" )
    @GetMapping("/findAll")
    public List<Certificate> findCertificatesByCpf(
        @RequestParam(required = true) String cpf) {
        return service.certificatesByCpf(cpf);
    }
    
    
    
}
