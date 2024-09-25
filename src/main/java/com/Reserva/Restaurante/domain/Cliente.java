package com.Reserva.Restaurante.domain;

import jakarta.persistence.*;

@Entity(name = Cliente)
@Table(name= Cliente)
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String telefone;
    private int cpf;
}
