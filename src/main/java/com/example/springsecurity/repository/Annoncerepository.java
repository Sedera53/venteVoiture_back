package com.example.springsecurity.repository;

import com.example.springsecurity.model.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Annoncerepository extends JpaRepository<Annonce,Integer> {
    @Query("select a from Annonce a where a.idutilisateur = :idutilisateur")
    List<Annonce> myannonce(int idutilisateur);

    @Query("select a from Annonce a where a.etat = :etat")
    List<Annonce> etat(int etat);

    @Query("select a from Annonce a where a.validation = :validation")
    List<Annonce> validation(int validation);

    @Query("SELECT a FROM Annonce a WHERE a.prix BETWEEN :minPrix AND :maxPrix or a.idmarque= :idmarque  or a.modele=:modele or a.idcategorie= :idcategorie")
    List<Annonce> recherche(double minPrix,double maxPrix,int idmarque,String modele,int idcategorie);

    @Query("Select a From Annonce a where a.idannonce= :idannonce")
    List<Annonce> findbyidannonce(int idannonce);
}
