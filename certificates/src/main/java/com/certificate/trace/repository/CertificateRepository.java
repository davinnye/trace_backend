package com.certificate.trace.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certificate.trace.model.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {
        Optional<Certificate> findByCode (String code);

        List<Certificate> findByCpf (String cpf);
}
