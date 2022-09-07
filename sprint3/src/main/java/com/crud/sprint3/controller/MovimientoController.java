package com.crud.sprint3.controller;


import com.crud.sprint3.model.Movimiento;
import com.crud.sprint3.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoController {

        @Autowired
        MovimientoService movimientoService;

        @PostMapping(path = "/movimiento")
        private void guardarMovimiento(@RequestBody Movimiento movimiento){
            movimientoService.guardarMovimiento(movimiento);
        }

        @GetMapping(path = "/movimiento")
        private List<Movimiento> obtenerMovimientos(){
            return movimientoService.verMovimientos();

        }

        @GetMapping(path = "/movimiento/{id}")
        private Movimiento obtenerMovimientoPorId(@PathVariable("id") Long id){
            return movimientoService.obtenerMovimientoPorId(id);
        }

        @DeleteMapping(path = "/movimiento/{id}")
        private void eliminarMovimiento(@PathVariable("id") Long id){
            movimientoService.eliminarMovimiento(id);
        }

        @PutMapping(path = "/movimiento/{id}")
        private void actualizarMovimiento(@RequestBody Movimiento movimiento){
            movimientoService.guardarMovimiento(movimiento);
        }

        @GetMapping(path = "/movimiento/empresa/{id}")
        private List<Movimiento> obtenerMovimientosPorEmpresa(@PathVariable("id") Long id){
            return movimientoService.obtenerMovimientosPorEmpresa(id);
        }

}
