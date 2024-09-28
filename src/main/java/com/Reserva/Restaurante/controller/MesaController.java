package com.Reserva.Restaurante.controller;

import com.Reserva.Restaurante.domain.mesa.Mesa;
import com.Reserva.Restaurante.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    // Criar uma nova mesa
    @PostMapping
    public ResponseEntity<Mesa> criarMesa(@RequestBody Mesa mesa) {
        Mesa novaMesa = mesaService.criarMesa(mesa);
        return new ResponseEntity<>(novaMesa, HttpStatus.CREATED);
    }

    // Listar todas as mesas
    @GetMapping
    public ResponseEntity<List<Mesa>> listarMesas() {
        List<Mesa> mesas = mesaService.listarMesas();
        return new ResponseEntity<>(mesas, HttpStatus.OK);
    }

    // Buscar uma mesa por ID
    @GetMapping("/{id}")
    public ResponseEntity<Mesa> buscarMesaPorId(@PathVariable Long id) {
        Mesa mesa = mesaService.buscarMesaPorId(id);
        return new ResponseEntity<>(mesa, HttpStatus.OK);
    }

    // Atualizar uma mesa
    @PutMapping("/{id}")
    public ResponseEntity<Mesa> atualizarMesa(@PathVariable Long id, @RequestBody Mesa mesaDetails) {
        Mesa mesaAtualizada = mesaService.atualizarMesa(id, mesaDetails);
        return new ResponseEntity<>(mesaAtualizada, HttpStatus.OK);
    }

    // Excluir uma mesa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirMesa(@PathVariable Long id) {
        mesaService.excluirMesa(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
