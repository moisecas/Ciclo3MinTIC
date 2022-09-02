package mvc.movimiento.Repositories;

import mvc.movimiento.Entities.Movimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimiento, Long> {
    public abstract ArrayList<Movimiento> findById(Integer id);
}




