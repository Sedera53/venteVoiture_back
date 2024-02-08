package com.example.springsecurity.Service;

import com.example.springsecurity.model.Statistique;
import com.example.springsecurity.repository.Statistiquerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Statistiqueserviceimpl implements Statistiqueservice {
    @Autowired
    private Statistiquerepo statistiquerepo;


    @Override
    public List<Statistique> getstat() {
        return statistiquerepo.findstat();
    }
}
