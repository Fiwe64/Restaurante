package com.Reserva.Restaurante.repository;

import com.Reserva.Restaurante.domain.clientes.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
