package com.example.springsecurity.repository;

import com.example.springsecurity.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message,Integer> {
    @Query("{ 'idEnvoyeur' : ?0, 'idDestinataire' : ?1 }")
    List<Message> find(Integer idEnvoyeur, Integer idDestinataire);
}
