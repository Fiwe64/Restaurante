package com.Reserva.Restaurante.repository;


import com.Reserva.Restaurante.domain.reserva.Reserva;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
