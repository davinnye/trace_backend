package com.certificate.trace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.certificate.trace.model.Certificate;
import com.certificate.trace.service.CertificateService;



@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @PostMapping
    public Certificate register(@RequestParam String cpf) {
        return service.registerCertificate(cpf);
    }

    @GetMapping("/validate")
    public Optional<Certificate> validateCertificate(
        @RequestParam(required = true) String code) {
        return service.validateCertificateByCode(code);
    }

    @GetMapping("/findAll")
    public List<Certificate> findCertificatesByCpf(
        @RequestParam(required = true) String cpf) {
        return service.certificatesByCpf(cpf);
    }
    
    
    
}
