package com.Reserva.Restaurante.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = Usuarios)
@Table(name = Usuarios)
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String senha;
    private LocalDate dataCriacao;

}
