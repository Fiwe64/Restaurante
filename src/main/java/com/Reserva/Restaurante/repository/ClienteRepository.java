package com.Reserva.Restaurante.repository;

import com.Reserva.Restaurante.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
