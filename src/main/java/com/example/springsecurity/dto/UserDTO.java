package com.example.springsecurity.dto;

import com.example.springsecurity.user.User;

public class UserDTO {
    String token;
    User user;

    public UserDTO() {
    }

    public UserDTO(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
