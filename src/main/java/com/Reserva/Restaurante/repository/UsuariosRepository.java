package com.Reserva.Restaurante.repository;

import com.Reserva.Restaurante.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
