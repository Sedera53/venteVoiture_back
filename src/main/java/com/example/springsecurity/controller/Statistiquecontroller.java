package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Statistiqueservice;
import com.example.springsecurity.model.Statistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@CrossOrigin
public class Statistiquecontroller {
    @Autowired
    private Statistiqueservice statistiqueservice;
    @GetMapping("/stat")
    public List<Statistique> getstat(){
        return statistiqueservice.getstat();
    }
}
