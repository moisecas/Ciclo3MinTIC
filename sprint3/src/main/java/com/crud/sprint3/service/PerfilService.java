package com.crud.sprint3.service;
import com.crud.sprint3.model.Empresa;
import com.crud.sprint3.model.Perfil;
import com.crud.sprint3.repositories.perfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerfilService {

    @Autowired
    perfilRepository perfilRepository;

    //post
    public Perfil guardarPerfil(Perfil perfil){
        return perfilRepository.save(perfil);
    }

    //delete
    public void eliminarPerfil(Long id){
        perfilRepository.deleteById(id);
    }

    //get
    public List<Perfil> verPerfiles() {
        return perfilRepository.findAll();
    }

    //get por id
    public Perfil obtenerPerfilPorId(Long id) {
        return perfilRepository.findById(id).get();
    }


}
