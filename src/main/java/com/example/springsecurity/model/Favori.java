package com.example.springsecurity.model;

import com.example.springsecurity.user.User;
import jakarta.persistence.*;

@Entity
public class Favori {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idfavori;

    int idannonce;
    int idutilisateur;

    public Favori() {
    }

    public Favori(int idfavori, int idannonce, int idutilisateur) {
        this.idfavori = idfavori;
        this.idannonce = idannonce;
        this.idutilisateur = idutilisateur;
    }

    public int getIdfavori() {
        return idfavori;
    }

    public void setIdfavori(int idfavori) {
        this.idfavori = idfavori;
    }

    public int getIdannonce() {
        return idannonce;
    }

    public void setIdannonce(int idannonce) {
        this.idannonce = idannonce;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }
}
