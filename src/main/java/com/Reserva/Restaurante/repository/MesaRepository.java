package com.Reserva.Restaurante.repository;

import com.Reserva.Restaurante.domain.mesa.Mesas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesas, Long> {

}
