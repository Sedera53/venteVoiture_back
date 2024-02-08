package com.example.springsecurity.repository;

import com.example.springsecurity.model.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Marquerepository extends JpaRepository<Marque,Integer> {
}
