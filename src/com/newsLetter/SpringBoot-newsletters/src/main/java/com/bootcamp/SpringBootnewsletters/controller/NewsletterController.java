package com.bootcamp.SpringBootnewsletters.controller;


import com.bootcamp.SpringBootnewsletters.entity.Leads;

import com.bootcamp.SpringBootnewsletters.repository.NewsLetterDAO;
import com.bootcamp.SpringBootnewsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsletterController {

    @Autowired
    private NewsLetterDAO newsLetterDAO;

    @GetMapping("/api/newsletter")
    public List<Leads> getEmail() {
        return newsLetterDAO.getEmail();
    }

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Leads leads) {

        EmailValidator validator = new EmailValidator();

        if (!(validator.isValido(leads.getEmail()))){
            return "El email no es valido";
        }

        boolean isRegistrado = newsLetterDAO.registrarEmail(leads);
        return isRegistrado ? "Email registrado" : "El email ya existe" ;
    }


    @PostMapping ("/api/unsuscribe")
    public String eliminarEmail(@RequestBody Leads leads) {
          boolean isEliminado = newsLetterDAO.eliminarEmail(leads.getEmail());
        return isEliminado ? "Email eliminado": "Email no encontrado";
    }
}
