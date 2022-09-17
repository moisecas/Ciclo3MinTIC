package com.co.udea.mintic.mvc.controller;

import com.co.udea.mintic.mvc.entities.Persona;
import com.co.udea.mintic.mvc.services.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    private PersonaService service;

    public FrontController(PersonaService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String iniciar(){
        return "index";
    }

    @GetMapping("/personal")
    public String getPersonas(Model model){
        List<Persona> personas = this.service.getLstPersonas();
        model.addAttribute("personas", personas);
        return "personas";
    }

    @GetMapping("/personal/nueva")
    public String crearPersona (Model model) {
        model.addAttribute("persona", new Persona());
        return "agregarpersonas";
    }
}
