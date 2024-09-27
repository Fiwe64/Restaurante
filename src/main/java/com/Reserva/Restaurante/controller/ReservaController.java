import com.Reserva.Restaurante.domain.cliente.Cliente;
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
    @PostMapping("/cliente/mesa/{id}")
    public ResponseEntity<Reserva> reservarMesa(
            @PathVariable Long id,
            @RequestBody Cliente clienteDetails,
            @RequestBody Reserva reservaDetails) {

        Reserva reserva = reservaService.criarReserva(id, clienteDetails, reservaDetails);
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
