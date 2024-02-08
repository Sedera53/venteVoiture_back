package com.example.springsecurity.Service;

import com.example.springsecurity.repository.UserRepository;
import com.example.springsecurity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public List<User> is_Logged(int iduser){
        return userRepository.getUserLogged(iduser);
    }
}
