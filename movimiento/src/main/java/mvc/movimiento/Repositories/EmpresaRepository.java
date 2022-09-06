package mvc.movimiento.Repositories;

import mvc.movimiento.Entities.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    public abstract ArrayList<Empresa> findById(Integer id);
}



