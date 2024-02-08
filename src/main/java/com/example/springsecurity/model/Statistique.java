package com.example.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class Statistique {
    @Id
    String marque;
    Long nombreAnnonces;
    Long nombreAnnoncesValidees;

    public Statistique() {
    }

    public Statistique(String marque, Long nombreAnnonces, Long nombreAnnoncesValidees) {
        this.marque = marque;
        this.nombreAnnonces = nombreAnnonces;
        this.nombreAnnoncesValidees = nombreAnnoncesValidees;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Long getNombreAnnonces() {
        return nombreAnnonces;
    }

    public void setNombreAnnonces(Long nombreAnnonces) {
        this.nombreAnnonces = nombreAnnonces;
    }

    public Long getNombreAnnoncesValidees() {
        return nombreAnnoncesValidees;
    }

    public void setNombreAnnoncesValidees(Long nombreAnnoncesValidees) {
        this.nombreAnnoncesValidees = nombreAnnoncesValidees;
    }
}
