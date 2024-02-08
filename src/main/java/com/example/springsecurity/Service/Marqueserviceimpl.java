package com.example.springsecurity.Service;

import com.example.springsecurity.model.Marque;
import com.example.springsecurity.repository.Marquerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Marqueserviceimpl implements Marqueservice {
    @Autowired
    private Marquerepository marquerepository;

    @Override
    public List<Marque> affichermarque() {
        return marquerepository.findAll();
    }

    @Override
    public Marque inserermarque(Marque marque) {
        return marquerepository.save(marque);
    }
}
