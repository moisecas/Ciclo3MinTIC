package com.crud.sprint3.service;


import com.crud.sprint3.model.Movimiento;
import com.crud.sprint3.repositories.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoService {

        @Autowired
        MovimientoRepository movimientoRepository;

        //post
        public Movimiento guardarMovimiento(Movimiento movimiento){
            return movimientoRepository.save(movimiento);
        }

        //delete
        public void eliminarMovimiento(Long id){
            movimientoRepository.deleteById(id);
        }

        //get
        public List<Movimiento> verMovimientos() {
            return movimientoRepository.findAll();
        }

        //get por id
        public Movimiento obtenerMovimientoPorId(Long id) {
            return movimientoRepository.findById(id).get();
        }

        public List<Movimiento> obtenerMovimientosPorEmpresa(Long id) {
            return movimientoRepository.findByEmpresaId(id);
        }

        public List<Movimiento> obtenerPorEmpresa(Long id) {
            return movimientoRepository.findByEmpresaIdMovimiento(id);
        }



}
