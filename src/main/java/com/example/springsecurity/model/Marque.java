    package com.example.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idmarque;

    String Marque;

    public Marque() {
    }

    public Marque(int idmarque, String marque) {
        this.idmarque = idmarque;
        Marque = marque;
    }

    public int getIdmarque() {
        return idmarque;
    }

    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }
}
