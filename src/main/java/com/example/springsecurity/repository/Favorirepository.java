package com.example.springsecurity.repository;

import com.example.springsecurity.model.Favori;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Favorirepository extends JpaRepository<Favori,Integer> {
    @Query("select f from Favori f where f.idutilisateur= :idutilisateur")
    List<Favori> myfavori(int idutilisateur);
    @Modifying
    @Transactional
    @Query("delete from Favori f where f.idannonce = :idfavori")
    void deleteByIdfavori(int idfavori);
}
