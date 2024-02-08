package com.example.springsecurity.repository;

import com.example.springsecurity.model.Annonce;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Validationannoncerepo extends CrudRepository<Annonce,Integer> {
    @Modifying
    @Query("UPDATE Annonce a SET etat = :newEtat WHERE a.idannonce = :annonceId")
    void updateEtat(@Param("annonceId") int annonceId, @Param("newEtat") int newEtat);

    @Modifying
    @Query("UPDATE Annonce a SET validation = :newvalidation WHERE a.idannonce = :annonceId")
    void updatevalidation(@Param("annonceId") int annonceId, @Param("newvalidation") int newvalidation);
}
