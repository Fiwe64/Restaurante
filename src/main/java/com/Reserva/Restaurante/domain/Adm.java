package com.Reserva.Restaurante.domain;

import jakarta.persistence.*;

@Entity(name = Adm)
@Table(name = Adm)

public class Adm {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private int telefone;
    private String email;
    private String senha;
}
