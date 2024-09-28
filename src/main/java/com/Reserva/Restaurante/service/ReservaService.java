package com.Reserva.Restaurante.service;

import  com.Reserva.Restaurante.domain.cliente.Cliente;
import com.Reserva.Restaurante.domain.mesa.Mesa;
import com.Reserva.Restaurante.domain.reserva.Reserva;
import com.Reserva.Restaurante.exception.ResourceNotFoundException;
import com.Reserva.Restaurante.repository.ClienteRepository;
import com.Reserva.Restaurante.repository.MesaRepository;
import com.Reserva.Restaurante.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MesaRepository mesaRepository;

    // Criar uma nova reserva
    public Reserva criarReserva(Long id, Cliente clienteDetails, Reserva reservaDetails) {
        // Buscar ou criar o cliente com base no email
        Cliente cliente = clienteRepository.findById(clienteDetails.getId())
                .orElseGet(() -> {
                    Cliente novoCliente = new Cliente();
                    novoCliente.setNome(clienteDetails.getNome());
                    novoCliente.setTelefone(clienteDetails.getTelefone());
                    novoCliente.setEmail(clienteDetails.getEmail());
                    return clienteRepository.save(novoCliente);
                });

        // Buscar a mesa pelo ID
        Mesa mesa = mesaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mesa não encontrada"));

        // Configurar a reserva com o cliente e a mesa
        reservaDetails.setCliente(cliente);
        reservaDetails.setMesa(mesa);

        // Salvar a reserva no banco de dados
        return reservaRepository.save(reservaDetails);
    }

    // Listar todas as reservas
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    // Buscar uma reserva por ID
    public Reserva buscarReservaPorId(Long id) {
        return reservaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reserva não encontrada"));
    }
}

