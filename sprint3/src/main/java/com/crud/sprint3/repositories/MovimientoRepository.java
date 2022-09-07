package com.crud.sprint3.repositories;

import com.crud.sprint3.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByEmpresaId(Long id); //recibe la clase y el tipo de dato del id a la cual pertenece

}



