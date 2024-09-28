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
    public Reserva criarReserva(Reserva reservaDetails) {
        // Buscar o cliente pelo ID
        Cliente cliente = clienteRepository.findById(reservaDetails.getCliente().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado"));

        // Buscar a mesa pelo ID
        Mesa mesa = mesaRepository.findById(reservaDetails.getMesa().getId())
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


