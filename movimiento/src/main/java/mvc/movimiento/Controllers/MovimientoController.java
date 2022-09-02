package mvc.movimiento.Controllers;

import mvc.movimiento.Entities.Movimiento;
import mvc.movimiento.Services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/movimiento")
public class MovimientoController {
    @Autowired
    MovimientoService movimientoService;

    @GetMapping()
    public ArrayList<Movimiento> obtenerMovimientos(){
        return movimientoService.obtenerMovimientos();
    }

    @PostMapping()
    public Movimiento guardarMovimiento(@RequestBody Movimiento movimiento){
        return this.movimientoService.guardarMovimiento(movimiento);
    }


}
