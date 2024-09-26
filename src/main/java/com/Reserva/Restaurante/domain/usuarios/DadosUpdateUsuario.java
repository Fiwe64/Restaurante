package com.Reserva.Restaurante.domain.usuarios;

import java.time.LocalDate;

public record DadosUpdateUsuario(
        String userName,
        String senha,
        LocalDate dataCriacao
) {
}
