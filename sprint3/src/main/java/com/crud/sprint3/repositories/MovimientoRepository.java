package com.crud.sprint3.repositories;

import com.crud.sprint3.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByEmpresaId(Long id); //recibe la clase y el tipo de dato del id a la cual pertenece

    //metodo para filtrar movimientos por empresa id
    @Query(value = "SELECT * FROM movimiento WHERE empresa_id = ?1", nativeQuery = true)
    public abstract List<Movimiento> findByEmpresaIdMovimiento(Long id); //recibe la clase y el tipo de dato del id a la cual pertenece




}



