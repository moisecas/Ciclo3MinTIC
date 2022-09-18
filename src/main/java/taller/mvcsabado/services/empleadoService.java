package taller.mvcsabado.services;

import org.springframework.stereotype.Repository;
import taller.mvcsabado.model.empleado;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class empleadoService implements empleadoServiceInterfaz {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<empleado> getAllEmployees() {
        String hql = "FROM empleado as emp ORDER BY emp.id"; //hql es el lenguaje de consulta de hibernate para obtener datos de la base de datos
        return (List<empleado>) entityManager.createQuery(hql).getResultList();
    }

}
