package com.Reserva.Restaurante.domain.mesas;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Mesa")
@Table(name = "Mesa")

public class Mesas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String tipo;

}
