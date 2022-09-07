package com.crud.sprint3.controller;

import com.crud.sprint3.model.Perfil;
import com.crud.sprint3.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PerfilController {

    @Autowired
    PerfilService perfilService;

    @PostMapping(path = "/perfil")
    private void guardarPerfil(@RequestBody Perfil perfil){
        perfilService.guardarPerfil(perfil);
    }

    @GetMapping(path = "/perfil")
    private List<Perfil> obtenerPerfiles(){
        return perfilService.verPerfiles();

    }
    @GetMapping(path = "/perfil/{id}")
    private Perfil obtenerPerfilPorId(@PathVariable("id") Long id){
        return perfilService.obtenerPerfilPorId(id);
    }

    @DeleteMapping(path = "/perfil/{id}")
    private void eliminarPerfil(@PathVariable("id") Long id){
        perfilService.eliminarPerfil(id);
    }

    @PutMapping(path = "/perfil/{id}")
    private void actualizarPerfil(@RequestBody Perfil perfil){
        perfilService.guardarPerfil(perfil);
    }


}
