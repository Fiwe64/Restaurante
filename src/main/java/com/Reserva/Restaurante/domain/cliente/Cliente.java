package com.Reserva.Restaurante.domain.cliente;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Cliente")
@Table(name= "clientes")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String telefone;
    private String email;

    public Cliente(){}
    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
    }
}
