package com.example.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idetat;

    String etat;

    public Etat() {
    }

    public Etat(int idetat, String etat) {
        this.idetat = idetat;
        this.etat = etat;
    }

    public int getIdetat() {        return idetat;
    }

    public void setIdetat(int idetat) {
        this.idetat = idetat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
