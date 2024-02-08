package com.example.springsecurity.Service;

import com.example.springsecurity.model.Categorie;
import com.example.springsecurity.repository.Categorierepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categorieserviceimpl implements Categorieservice {
    @Autowired
    private Categorierepository categorierepository;

    @Override
    public Categorie inserercategorie(Categorie categorie) {
        return categorierepository.save(categorie);
    }
    @Override
    public List<Categorie> affichercategorie() {
        return categorierepository.findAll();
    }
}
