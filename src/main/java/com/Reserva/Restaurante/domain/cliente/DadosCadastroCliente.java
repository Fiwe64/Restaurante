package com.Reserva.Restaurante.domain.cliente;

import jakarta.validation.constraints.Email;

public record DadosCadastroCliente(
        String nome,
        String telefone,
        String email
) {
}
