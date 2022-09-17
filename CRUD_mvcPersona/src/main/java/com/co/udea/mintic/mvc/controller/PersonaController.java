package com.co.udea.mintic.mvc.controller;

import com.co.udea.mintic.mvc.entities.ListaPersonas;
import com.co.udea.mintic.mvc.entities.Persona;
import com.co.udea.mintic.mvc.services.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class PersonaController {
    private PersonaService service;

    //Constructor
    public PersonaController(PersonaService service) {
        this.service = service;
    }
    //Constructor

    /*@GetMapping(path = "/lista")
    public List<Persona> listaPersonas(){
        return this.service.getLstPersonas();
    }*/

    @PostMapping("/personal")
    public RedirectView crearPersona(@ModelAttribute Persona persona, Model model){
        model.addAttribute(persona);
        this.service.crearPersona(persona);
        return new RedirectView("/personal");
    }

    @GetMapping("/personal/eliminar/{id}")
    public RedirectView borrarPersona(@PathVariable("id") Long id) {
        this.service.borrarPersona(id);
        return new RedirectView("/personal");
    }
}
