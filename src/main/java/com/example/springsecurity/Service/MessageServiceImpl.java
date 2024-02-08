package com.example.springsecurity.Service;

import com.example.springsecurity.model.Message;
import com.example.springsecurity.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    @Override
    public Message creer(Message v) {
        return messageRepository.save(v);
    }

    @Override
    public List<Message> lire() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> findByTwoId(Integer idEnvoyeur, Integer idDestinataire) {
        return messageRepository.find(idEnvoyeur, idDestinataire);
    }

    @Override
    public Message modifier(Integer id, Message v) {
        return messageRepository.findById(id)
                .map(p-> {
                    p.setText(v.getText());
                    return messageRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Message non trouve!!"));
    }

    @Override
    public String supprimer(Integer id) {
        messageRepository.deleteById(id);
        return "DeleteMessage : id"+id;
    }
}
