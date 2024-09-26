package com.Reserva.Restaurante.domain.usuario;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "Usuario")
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String senha;
    private LocalDate dataCriacao;

    public Usuario() {
    }

    public Usuario(DadosCadastroUsuario dados) {
        this.userName = dados.userName();
        this.senha = dados.senha();
        this.dataCriacao = dados.dataCriacao();
    }
}
