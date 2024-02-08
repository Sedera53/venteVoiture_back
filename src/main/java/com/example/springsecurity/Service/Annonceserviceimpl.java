package com.example.springsecurity.Service;

import com.example.springsecurity.model.Annonce;
import com.example.springsecurity.repository.Annoncerepository;
import com.example.springsecurity.repository.Validationannoncerepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Annonceserviceimpl implements Annonceservice {
    @Autowired
    private Annoncerepository annoncerepository;

    @Autowired
    private Validationannoncerepo validationannoncerepo;

    @Override
    public List<Annonce> publ() {
        return annoncerepository.findAll();
    }

    @Override
    public Annonce insererannonce(Annonce annonces) {
        return annoncerepository.save(annonces);
    }

    @Override
    public List<Annonce> getannonceparutilisateur(int idutilisateur) {
        return annoncerepository.myannonce(idutilisateur);
    }

    @Override
    public List<Annonce> etat(int etat) {
        return annoncerepository.etat(etat);
    }

    @Override
    public List<Annonce> validation(int validation) {
        return annoncerepository.validation(validation);
    }

    @Override
    public List<Annonce> recherchemultiple(double minPrix, double maxPrix, int idmarque, String modele, int idcategorie) {
        return annoncerepository.recherche(minPrix,maxPrix,idmarque,modele,idcategorie);
    }
    @Transactional
    public void updateEtat(int annonceId, int newEtat) {
        validationannoncerepo.updateEtat(annonceId, newEtat);
    }

    @Transactional
    public void updatevalidation(int annonceId, int newvalidation) {
        validationannoncerepo.updatevalidation(annonceId, newvalidation);
    }

    @Override
    public List<Annonce> findbyidannonce(int idannonce) {
        return annoncerepository.findbyidannonce(idannonce);
    }
}
