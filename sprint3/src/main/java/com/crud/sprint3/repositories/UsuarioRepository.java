package com.crud.sprint3.repositories;

import com.crud.sprint3.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    public Usuarios findByUsername(String username);
}

