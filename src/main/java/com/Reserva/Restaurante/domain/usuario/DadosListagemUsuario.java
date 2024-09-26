package com.Reserva.Restaurante.domain.usuario;

import java.time.LocalDate;

public record DadosListagemUsuario(
        Long id,
        String userName,
        String senha,
        LocalDate dataCriacao
) {
    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getUserName(),usuario.getSenha(),usuario.getDataCriacao());
    }
}
