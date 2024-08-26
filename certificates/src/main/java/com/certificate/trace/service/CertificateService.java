package com.certificate.trace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificate.trace.model.Certificate;
import com.certificate.trace.repository.CertificateRepository;

@Service
public class CertificateService {


    @Autowired
    private CertificateRepository repository;

    public Certificate registerCertificate(String cpf) {
        Certificate certificate = new Certificate();
        certificate.setCpf(cpf);
        return repository.save(certificate);
    }

    public Optional<Certificate> validateCertificateByCode(String code) {
        return repository.findByCode(code);
    }

    public List<Certificate> certificatesByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

}
