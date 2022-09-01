package andrescarnesmvc.mvc.controller;

//importacion empresa entties
import andrescarnesmvc.mvc.Entities.Empresa;

//import empresaservice services
import andrescarnesmvc.mvc.Services.EmpresaService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class Empresacontroller {
    EmpresaService service;

    //constructor Empresacontroller
    public Empresacontroller() {
        this.service=new EmpresaService();
    }

    @GetMapping("/Empresa")
    public List<Empresa> empresaLis(){
        return this.service.getEmpresaList();
    }
}
