package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Annonceservice;
import com.example.springsecurity.model.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class Annoncecontroller {
    @Autowired
    private Annonceservice annoncesservice;
    @GetMapping("/liste_annonce")
    public List<Annonce> get(){
        return annoncesservice.publ();
    }
    @PostMapping("/inserer_annonce")
    public String inserer(@RequestBody Annonce annonces){
        annoncesservice.insererannonce(annonces);
        return "annonce";
    }
    /* */
    @GetMapping("/historique/{idutilisateur}")
    public List<Annonce> getannonce(@PathVariable int idutilisateur){
        return annoncesservice.getannonceparutilisateur(idutilisateur);
    }

    @GetMapping("/etat/{etat}")
    public List<Annonce> getetat(@PathVariable int etat){
        return annoncesservice.etat(etat);
    }

    @GetMapping("/validation/{validation}")
    public List<Annonce> getvalidation(@PathVariable int validation){
        return annoncesservice.validation(validation);
    }

    @GetMapping("/recherche/{minPrix}/{maxPrix}/{idmarque}/{modele}/{idcategorie}")
    public List<Annonce> rechercheAnnonces(
            @PathVariable double minPrix,
            @PathVariable double maxPrix,
            @PathVariable int idmarque,
            @PathVariable String modele,
            @PathVariable int idcategorie) {
        return annoncesservice.recherchemultiple(minPrix, maxPrix, idmarque, modele, idcategorie);
    }

    @GetMapping("/detail_annonce/{idannonce}")
    public List<Annonce> findbyidannonce(@PathVariable int idannonce){
        return annoncesservice.findbyidannonce(idannonce);
    }

    @PatchMapping("/{id}/vendu")
    public ResponseEntity<String> updateEtat(@PathVariable("id") int annonceId, @RequestParam("newEtat") int newEtat) {
        annoncesservice.updateEtat(annonceId, newEtat);
        return ResponseEntity.ok("Etat updated successfully");
    }

    @PatchMapping("/{id}/valider")
    public ResponseEntity<String> updatevalidation(@PathVariable("id") int annonceId, @RequestParam("newvalidation") int newvalidation) {
        annoncesservice.updatevalidation(annonceId, newvalidation);
        return ResponseEntity.ok("annonce valide!");
    }
}

