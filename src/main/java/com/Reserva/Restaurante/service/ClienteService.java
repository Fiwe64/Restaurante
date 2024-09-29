package com.Reserva.Restaurante.service;

import com.Reserva.Restaurante.domain.cliente.Cliente;
import com.Reserva.Restaurante.domain.cliente.DadosCadastroCliente;
import com.Reserva.Restaurante.domain.cliente.DadosListagemCliente;
import com.Reserva.Restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clientesRepository;

    //criar Clientes
    public Cliente criarCliente(DadosCadastroCliente dados) {
        Cliente cliente = new Cliente(dados);
        return clientesRepository.save(cliente);
    }
    // Listar todos os Clientes com DadosListagemClientes
    public List<DadosListagemCliente> listarClientes() {
        return clientesRepository.findAll().stream()
                .map(DadosListagemCliente::new)
                .collect(Collectors.toList());
    }

}
