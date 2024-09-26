package com.Reserva.Restaurante.domain.reservas;

import com.Reserva.Restaurante.domain.clientes.Clientes;
import com.Reserva.Restaurante.domain.mesas.Mesas;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity(name = "Reservas")
@Table(name = "Reservas")

public class Reservas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDate data;
    @ManyToOne
    private Clientes cliente;
    @OneToOne
    private Mesas mesa;

}
