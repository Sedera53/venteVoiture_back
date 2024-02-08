package com.example.springsecurity.demo;

import com.example.springsecurity.Service.UserService;
import com.example.springsecurity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/demo")
@CrossOrigin
public class DemoController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello spring security");
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAllUser();
    }
    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("first", "second"));
    }
    @GetMapping("/users/{iduser}")
    public List<User> loggedUser(@PathVariable int iduser){
        return userService.is_Logged(iduser);
    }
}
