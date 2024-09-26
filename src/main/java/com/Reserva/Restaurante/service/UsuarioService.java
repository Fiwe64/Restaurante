package com.Reserva.Restaurante.service;

import com.Reserva.Restaurante.domain.usuarios.DadosCadastroUsuario;
import com.Reserva.Restaurante.domain.usuarios.DadosListagemUsuario;
import com.Reserva.Restaurante.domain.usuarios.DadosUpdateUsuario;
import com.Reserva.Restaurante.domain.usuarios.Usuario;
import com.Reserva.Restaurante.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class UsuarioService {
    @Autowired
    private UsuariosRepository usuariosRepository;//objeto do repositorio de usuario

    //criar Usuario
    public Usuario criarUsuario(DadosCadastroUsuario dados){
        Usuario usuario = new Usuario(dados);
        return usuariosRepository.save(usuario);
    }
    //Listar todos os usuario com DadosListagemUsuario
    public List<DadosListagemUsuario> listarUsuario(){
        return usuariosRepository.findAll().stream()
                .map(DadosListagemUsuario::new)
                .collect(Collectors.toList());
    }

    //Buscar Usuario por ID
    public Optional<Usuario> buscarUsuarioPorId(Long id){
        return usuariosRepository.findById(id);
    }
    //Atualizar Usuario com DadosUpdateUsuario
    public Usuario atualizarUsuario(Long id, DadosUpdateUsuario dados) {
        Usuario usuario = usuariosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));

        usuario.setUserName(dados.userName());
        usuario.setSenha(dados.senha());
        usuario.setDataCriacao(dados.dataCriacao());

        return usuariosRepository.save(usuario);
    }
    //Deletar Usuario
    public void deletarUsuario(Long id) {
        usuariosRepository.deleteById(id);
    }
}
