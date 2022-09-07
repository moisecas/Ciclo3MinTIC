package com.crud.sprint3.service;

import com.crud.sprint3.model.Empleado;
import com.crud.sprint3.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Indica que es un servicio
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> verEmpleados(){
        return empleadoRepository.findAll();
    } //llama al metodo findAll del repositorio para traer todos los empleados

    public void crearEmpleado(Empleado empleado){
        empleadoRepository.save(empleado); //guarda el empleado en la base de datos, save metodo que viene de JpaRepository
    }



    public void actualizarEmpleado(){

    }

    //eliminarEmpleado por id
    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }

}
