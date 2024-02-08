package com.example.springsecurity.repository;

import com.example.springsecurity.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categorierepository extends JpaRepository<Categorie,Integer> {
}
