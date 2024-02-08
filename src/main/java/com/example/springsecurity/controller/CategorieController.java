package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Categorieservice;
import com.example.springsecurity.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class CategorieController {
    @Autowired
    private Categorieservice categorieservice;

    @PostMapping("/inserer_categorie")
    public String inserercategorie(@RequestBody Categorie categorie){
        categorieservice.inserercategorie(categorie);
        return "save categorie";
    }
    @GetMapping("/liste_categorie")
    public List<Categorie> listecategorie(){
        return  categorieservice.affichercategorie();
    }
}
