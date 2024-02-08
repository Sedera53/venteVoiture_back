package com.example.springsecurity.model;

import com.example.springsecurity.user.User;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idannonce;

    int idcategorie;

    int idmarque;

    String modele;

    String matricule;

    Date annee_fabrication;

    String image;

    String detail;
    @Column(columnDefinition = "int default 0")
    int etat;

    int idutilisateur;
    @Column(columnDefinition = "int default 0")
    int validation;

    double prix;

    public Annonce() {
    }

    public Annonce(int idannonce, int idcategorie, int idmarque, String modele, String matricule, Date annee_fabrication, String image, String detail, int etat, int idutilisateur, int validation, double prix) {
        this.idannonce = idannonce;
        this.idcategorie = idcategorie;
        this.idmarque = idmarque;
        this.modele = modele;
        this.matricule = matricule;
        this.annee_fabrication = annee_fabrication;
        this.image = image;
        this.detail = detail;
        this.etat = etat;
        this.idutilisateur = idutilisateur;
        this.validation = validation;
        this.prix = prix;
    }

    public int getIdannonce() {
        return idannonce;
    }

    public void setIdannonce(int idannonce) {
        this.idannonce = idannonce;
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public int getIdmarque() {
        return idmarque;
    }

    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getAnnee_fabrication() {
        return annee_fabrication;
    }

    public void setAnnee_fabrication(Date annee_fabrication) {
        this.annee_fabrication = annee_fabrication;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
