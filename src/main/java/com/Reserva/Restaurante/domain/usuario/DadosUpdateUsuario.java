package com.Reserva.Restaurante.domain.usuario;

import java.time.LocalDate;

public record DadosUpdateUsuario(
        String userName,
        String senha,
        LocalDate dataCriacao
) {
}
