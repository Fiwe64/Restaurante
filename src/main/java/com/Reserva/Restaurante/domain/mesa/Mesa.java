package com.Reserva.Restaurante.domain.mesa;

import com.Reserva.Restaurante.domain.reserva.Reserva;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Mesa")
@Table(name = "mesas")

public class Mesa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Integer pessoas;


    @OneToOne
    private Reserva reserva;

}
