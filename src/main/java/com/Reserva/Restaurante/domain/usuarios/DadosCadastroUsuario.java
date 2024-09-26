package com.Reserva.Restaurante.domain.usuarios;

import java.time.LocalDate;

public record DadosCadastroUsuario(
        String userName,
        String senha,
        LocalDate dataCriacao
) {
}
