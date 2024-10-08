package com.certificate.trace.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "certificates")
@Getter
@Setter
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "bigint")
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable=false)
    private String cpf;

    @Column(nullable=false)
    private LocalDateTime data;

    public Certificate(){
        this.code = UUID.randomUUID().toString();
        this.data = LocalDateTime.now();
    }

}
