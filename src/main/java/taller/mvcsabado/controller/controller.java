package taller.mvcsabado.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import taller.mvcsabado.model.empleado;
import taller.mvcsabado.services.empleadoService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {

    @Autowired
    empleadoService empleado;

    @GetMapping("/empleado")
    public String getEmpleado(Model model){
        List<taller.mvcsabado.model.empleado> empleados = empleado.getAllEmployees();
        model.addAttribute("empleado", empleado);
        return "empleado";
    }


    }









