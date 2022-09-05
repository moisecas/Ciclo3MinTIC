package mvc.movimiento.Services;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
//import movimiento
import mvc.movimiento.Entities.Movimiento;
import mvc.movimiento.Repositories.MovimientoRepository;

import java.util.ArrayList;
import java.util.Optional;


@Service // indica que es un servicio para Spring que se va a encargar de realizar las operaciones de la clase UsuarioServices
public class MovimientoService {
    @Autowired
    MovimientoRepository movimientoRepository;

    public ArrayList<Movimiento> obtenerMovimientos(){
        return (ArrayList<Movimiento>) movimientoRepository.findAll();
    }

    public Movimiento guardarMovimiento(Movimiento movimiento){
        return movimientoRepository.save(movimiento);
    }

    public Optional<Movimiento> obtenerPorId(Long id){
        return movimientoRepository.findById(id);
    }
    public boolean eliminarMovimiento(Long id) {
        try{
            movimientoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
