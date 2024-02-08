package com.example.springsecurity.Service;

import com.example.springsecurity.model.Marque;

import java.util.List;

public interface Marqueservice {
    public List<Marque> affichermarque();

    public Marque inserermarque(Marque marque);
}
