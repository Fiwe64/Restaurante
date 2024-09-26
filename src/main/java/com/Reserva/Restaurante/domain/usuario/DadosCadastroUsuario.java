package com.Reserva.Restaurante.domain.usuario;

import java.time.LocalDate;

public record DadosCadastroUsuario(
        String userName,
        String senha,
        LocalDate dataCriacao
) {
}
