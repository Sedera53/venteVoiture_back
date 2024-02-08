package com.example.springsecurity.Service;

import com.example.springsecurity.model.Favori;

import java.util.List;

public interface Favoriservice {
    public List<Favori> getallfavori();

    public Favori insererfavori(Favori favori);

    public List<Favori>  getfavori(int idutilisateur);
    public  void deletefavori(int idfavori);
}
