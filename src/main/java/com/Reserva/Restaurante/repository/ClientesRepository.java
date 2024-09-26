package com.Reserva.Restaurante.repository;

import com.Reserva.Restaurante.domain.cliente.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
