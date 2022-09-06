package mvc.movimiento.Controllers;

import mvc.movimiento.Entities.Movimiento;
import mvc.movimiento.Services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    //get por id
    @GetMapping( path = "/{id}")
    public Optional<Movimiento> obtenerMovimientoPorId(@PathVariable("id") Long id) {
            return this.movimientoService.obtenerPorId(id);


    }
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.movimientoService.eliminarMovimiento(id);
        if (ok){
            return "Se eliminó el movimiento con id " + id;
        }else{
            return "No pudo eliminar el movimiento con id" + id;
        }
    }


}
