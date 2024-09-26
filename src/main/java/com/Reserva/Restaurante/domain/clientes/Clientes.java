package com.Reserva.Restaurante.domain.clientes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Cliente")
@Table(name= "Cliente")
public class Clientes {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String telefone;
    private int cpf;
}
