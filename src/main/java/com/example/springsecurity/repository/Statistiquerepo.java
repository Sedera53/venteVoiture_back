package com.example.springsecurity.repository;

import com.example.springsecurity.model.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Statistiquerepo extends JpaRepository<Statistique,String> {
    @Query(nativeQuery = true, value = "SELECT\n" +
    "    m.marque,\n" +
    "    COUNT(*) AS nombre_annonces,\n" +
    "    SUM(CASE WHEN a.validation = 1 THEN 1 ELSE 0 END) AS nombre_annonces_validees\n" +
    "FROM\n" +
    "    annonce a\n" +
    "JOIN\n" +
    "    marque m ON a.idmarque = m.idmarque\n" +
    "GROUP BY\n" +
    "    m.marque;")
    List<Statistique> findstat();
}
