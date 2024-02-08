package com.example.springsecurity.Service;

import com.example.springsecurity.model.Favori;
import com.example.springsecurity.repository.Favorirepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Favoriserviceimpl implements  Favoriservice {
    @Autowired
    private Favorirepository favorirepository;

    @Override
    public List<Favori> getallfavori() {
        return favorirepository.findAll();
    }

    @Override
    public Favori insererfavori(Favori favori) {
        return favorirepository.save(favori);
    }

    @Override
    public List<Favori> getfavori(int idutilisateur) {
        return favorirepository.myfavori(idutilisateur);
    }

    @Override
    @Transactional
    public void deletefavori(int idfavori) {
        favorirepository.deleteByIdfavori(idfavori);
    }
}
