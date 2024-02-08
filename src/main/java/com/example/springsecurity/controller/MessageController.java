package com.example.springsecurity.controller;

import com.example.springsecurity.Service.MessageService;
import com.example.springsecurity.model.Message;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/addMessage")
    public String save(@RequestBody Message message){
        messageService.creer(message);
        return("insert ok : "+ message.getIdMessage());
    }

    @GetMapping("/GetAllMessage")
    public List<Message> getListeMessage(){
        List<Message> all = messageService.lire();
        return all;
    }

    @GetMapping("/GetOwnMessage/{idEnvoyeur}/{idDestinataire}")
    public List<Message> getMessageById(@PathVariable Integer idEnvoyeur , @PathVariable Integer idDestinataire){
        List<Message> all = messageService.findByTwoId(idEnvoyeur, idDestinataire);
        return all;
    }

    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Integer id){
        messageService.supprimer(id);
        return("delete ok");
    }
}
