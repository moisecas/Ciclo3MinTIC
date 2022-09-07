package com.crud.sprint3.service;


import com.crud.sprint3.model.Empresa;
import com.crud.sprint3.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository; //inyecta el repositorio



    //post
    public Empresa guardarEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    //delete
    public void eliminarEmpresa(Long id){
        empresaRepository.deleteById(id);
    }

    public List<Empresa> verEmpresas() {
        return empresaRepository.findAll();
    }

    public Empresa obtenerEmpresaPorId(Long id) {
        return empresaRepository.findById(id).get();
    }
}
