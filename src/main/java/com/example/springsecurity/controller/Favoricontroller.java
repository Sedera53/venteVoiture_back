package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Favoriservice;
import com.example.springsecurity.model.Favori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class Favoricontroller {
    @Autowired
    private Favoriservice favoriservice;

    @GetMapping("/all_favori")
    public List<Favori> getallfav(){
        return favoriservice.getallfavori();
    }

    @GetMapping("/liste_favori/{idutilisateur}")
    public List<Favori> getfav(@PathVariable int idutilisateur){
        return favoriservice.getfavori(idutilisateur);
    }

    @PostMapping("/inserer_favori")
    public String insererfavori(@RequestBody Favori favori){
        favoriservice.insererfavori(favori);
        return "favori";
    }
    @DeleteMapping("/favori/{idfavori}")
    public String supprimerAnnonce(@PathVariable int idfavori) {
        favoriservice.deletefavori(idfavori);
        return "delete";
    }
}
