package com.crud.sprint3.controller;


import com.crud.sprint3.model.Empleado;
import com.crud.sprint3.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping(path = "/empleado") //cuando se haga una peticion post a la ruta /crearEmpleado se ejecuta el metodo
    private void crearEmpleado(@RequestBody Empleado empleado){ //requestbody para que se pueda mapear el json que se envia
        empleadoService.crearEmpleado(empleado); //llama al metodo crearEmpleado del servicio y le pasa el empleado que se recibe por parametro para crear el empleado
    }

    @GetMapping(path = "/empleado")
    private List<Empleado> verEmpleados(){
        return empleadoService.verEmpleados();
    }

    //eliminarEmpleado por id deletemapping
    @DeleteMapping(path = "/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id") Long id){
        empleadoService.eliminarEmpleado(id);
    }


    @PutMapping(path = "/empleado")
    private void actualizarEmpleado(@RequestBody Empleado empleado){
        empleadoService.crearEmpleado(empleado); //llama al metodo crearEmpleado del servicio y le pasa el empleado que se recibe por parametro para crear el empleado
    }

    @GetMapping(path = "/empleado/{id}")
    private Empleado obtenerEmpleadoPorId(@PathVariable("id") Long id){
        return empleadoService.obtenerEmpleadoPorId(id);
    }



}
