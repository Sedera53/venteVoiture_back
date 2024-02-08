package com.example.springsecurity.Service;

import com.example.springsecurity.model.Categorie;

import java.util.List;

public interface Categorieservice {
    public  Categorie inserercategorie(Categorie categorie);

    public List<Categorie> affichercategorie();
}
