package com.Reserva.Restaurante.service;

import com.Reserva.Restaurante.domain.adm.Adm;
import com.Reserva.Restaurante.domain.adm.DadosCadastroAdm;
import com.Reserva.Restaurante.domain.adm.DadosUpdateAdm;
import com.Reserva.Restaurante.repository.AdmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class AdmService {
    @Autowired
    private AdmRepository admRepository;

    //Criar ADM
    public Adm criarAdm(DadosCadastroAdm dados){
        Adm adm = new Adm(dados);
        return admRepository.save(adm);
    }
    //buscar por ID
    public Optional<Adm> buscarAdmPorId(Long id){
        return admRepository.findById(id);
    }
    //Atualizar Usuario com DadosUpdateAdm
    public Adm atualizarAdm(Long id, DadosUpdateAdm dados){
        Adm adm = admRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("ADM Nao encontrado"));
        adm.setNome(dados.nome());
        adm.setTelefone(dados.telefone());
        adm.setEmail(dados.email());
        adm.setSenha(dados.senha());

        return admRepository.save(adm);
    }

}
