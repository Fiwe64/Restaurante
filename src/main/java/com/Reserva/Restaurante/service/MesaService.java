package com.Reserva.Restaurante.service;


import com.Reserva.Restaurante.exception.ResourceNotFoundException;
import com.Reserva.Restaurante.model.Mesa;
import com.Reserva.Restaurante.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    // Criar uma nova mesa
    public Mesa criarMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    // Listar todas as mesas
    public List<Mesa> listarMesas() {
        return mesaRepository.findAll();
    }

    // Buscar uma mesa por ID
    public Mesa buscarMesaPorId(Long id) {
        return mesaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mesa não encontrada com o ID: " + id));
    }

    // Atualizar uma mesa
    public Mesa atualizarMesa(Long id, Mesa mesaDetails) {
        Mesa mesa = buscarMesaPorId(id);
        mesa.setPessoas(mesaDetails.getPessoas());
        return mesaRepository.save(mesa);
    }

    // Excluir uma mesa
    public void excluirMesa(Long id) {
        mesaRepository.deleteById(id);
    }
}

