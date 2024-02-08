package com.example.springsecurity.Service;

import com.example.springsecurity.model.Message;

import java.util.List;

public interface MessageService {
    Message creer(Message v);

    List<Message> lire();

    List<Message> findByTwoId(Integer idEnvoyeur, Integer idDestinataire);

    Message modifier(Integer id, Message v);

    String supprimer(Integer id);
}
