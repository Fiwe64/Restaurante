package com.Reserva.Restaurante.domain.cliente;

import jakarta.validation.constraints.Email;

public record DadosCadastroCliente(
        @Email
        String email
) {
}
