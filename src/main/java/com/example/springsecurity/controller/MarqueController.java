package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Marqueservice;
import com.example.springsecurity.model.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class MarqueController {
    @Autowired
    private Marqueservice marqueservice;

    @GetMapping("/liste_marques")
    public List<Marque> affichermarque(){
        return marqueservice.affichermarque();
    }
    @PostMapping("/inserer_marque")
    public String inserermarque(@RequestBody Marque marque){
        marqueservice.inserermarque(marque);
        return "nouveau marque";
    }
}
