package com.Reserva.Restaurante.repository;

import com.Reserva.Restaurante.domain.mesa.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Long> {

}
