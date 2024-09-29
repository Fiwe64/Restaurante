package com.Reserva.Restaurante.controller;

import com.Reserva.Restaurante.domain.cliente.Cliente;
import com.Reserva.Restaurante.domain.cliente.DadosCadastroCliente;
import com.Reserva.Restaurante.domain.cliente.DadosListagemCliente;
import com.Reserva.Restaurante.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody DadosCadastroCliente cliente) {
        Cliente novoCliente = clienteService.criarCliente(cliente);
        return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<DadosListagemCliente>> listarClientes() {
        List<DadosListagemCliente> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }
}
