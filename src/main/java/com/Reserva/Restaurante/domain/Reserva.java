package com.Reserva.Restaurante.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity(name = Reserva)
@Table(name = Reserva)

public class Reserva {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDate data;

}
