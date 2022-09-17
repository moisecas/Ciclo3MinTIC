package com.co.udea.mintic.mvc.repository;

import com.co.udea.mintic.mvc.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
