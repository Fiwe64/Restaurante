package com.Reserva.Restaurante.domain.reserva;

import com.Reserva.Restaurante.domain.cliente.Cliente;
import com.Reserva.Restaurante.domain.mesa.Mesa;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity(name = "Reserva")
@Table(name = "reservas")

public class Reserva {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDate diaReserva;
    private LocalTime horario;

    @ManyToOne
    private Cliente cliente;
    @OneToOne
    private Mesa mesa;

}
