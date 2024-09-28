import com.Reserva.Restaurante.domain.reserva.Reserva;
import com.Reserva.Restaurante.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    // Criar uma nova reserva associada a um cliente e uma mesa
    @PostMapping
    public ResponseEntity<Reserva> reservarMesa(@RequestBody Reserva reservaDetails) {
        System.out.println("Reservar mesa: " + reservaDetails);
        Reserva reserva = reservaService.criarReserva(reservaDetails);
        return new ResponseEntity<>(reserva, HttpStatus.CREATED);
    }

    // Endpoint para listar todas as reservas
    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarReservas();
    }

    // Endpoint para buscar uma reserva específica
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> buscarReserva(@PathVariable Long id) {
        Reserva reserva = reservaService.buscarReservaPorId(id);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }
}
