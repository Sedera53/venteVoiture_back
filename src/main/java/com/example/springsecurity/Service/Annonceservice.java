package com.example.springsecurity.Service;

import com.example.springsecurity.model.Annonce;

import java.util.List;

public interface Annonceservice {
    public Annonce insererannonce(Annonce annonces);

    public List<Annonce> publ();

    public List<Annonce> getannonceparutilisateur(int idutilisateur);

    public List<Annonce> etat(int etat);

    public List<Annonce> validation(int validation);

    public List<Annonce> recherchemultiple(double minPrix,double maxPrix,int idmarque,String modele,int idcategorie);

    public void updateEtat(int annonceId, int newEtat);

    public void updatevalidation(int annonceId, int newvalidation);

    List<Annonce> findbyidannonce(int idannonce);
}
