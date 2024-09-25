package com.Reserva.Restaurante.domain;

import jakarta.persistence.*;

@Entity(name = Mesa)
@Table(name = Mesa)

public class Mesa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String tipo;

}
