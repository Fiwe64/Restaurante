package com.Reserva.Restaurante.domain.adm;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Adm")
@Table(name = "Adm")

public class Adm {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private int telefone;
    private String email;
    private String senha;
}
