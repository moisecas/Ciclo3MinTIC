package com.crud.sprint3.controller;



import com.crud.sprint3.model.Empresa;
import com.crud.sprint3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping(path = "/empresa")
    private void guardarEmpresa(@RequestBody Empresa empresa){
        empresaService.guardarEmpresa(empresa);
    }

    @GetMapping(path = "/empresa")
    private List<Empresa> obtenerEmpresas(){
        return empresaService.verEmpresas();

    }

    @GetMapping(path = "/empresa/{id}")
    private Empresa obtenerEmpresaPorId(@PathVariable("id") Long id){
        return empresaService.obtenerEmpresaPorId(id);
    }

    @DeleteMapping(path = "/empresa/{id}")
    private void eliminarEmpresa(@PathVariable("id") Long id){
        empresaService.eliminarEmpresa(id);
    }

    @PutMapping(path = "/empresa/{id}")
    private void actualizarEmpresa(@RequestBody Empresa empresa){
        empresaService.guardarEmpresa(empresa);
    }
}
