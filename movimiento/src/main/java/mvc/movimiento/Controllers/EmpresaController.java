package mvc.movimiento.Controllers;


import mvc.movimiento.Entities.Empresa;
import mvc.movimiento.Services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping()
    public ArrayList<Empresa> obtenerEmpresas(){
        return empresaService.obtenerEmpresas();
    }
    @PostMapping()
    public Empresa guardarEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.guardarEmpresa(empresa);
    }

    @GetMapping( path = "/{id}")
    public Optional<Empresa> obtenerEmpresaPorId(@PathVariable("id") Long id) {
        return this.empresaService.obtenerPorId(id);
    }
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.empresaService.eliminarEmpresa(id);
        if (ok){
            return "Se eliminó la empresa con id " + id;
        }else{
            return "No pudo eliminar la empresa con id" + id;
        }
    }


}
