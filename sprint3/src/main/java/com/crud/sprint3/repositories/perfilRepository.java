package com.crud.sprint3.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.sprint3.model.Perfil;
public interface perfilRepository extends  JpaRepository<Perfil, Long> {
}

