package com.Reserva.Restaurante.service;

import com.Reserva.Restaurante.domain.cliente.Cliente;
import com.Reserva.Restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clientesRepository;

    //criar Clientes
    public Cliente criarCliente(Cliente cliente) {
        return clientesRepository.save(cliente);
    }

}
