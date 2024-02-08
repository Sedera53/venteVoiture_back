package com.example.springsecurity.repository;

import com.example.springsecurity.user.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    @Query("select u from User u where u.id <> :iduser")
    List<User> getUserLogged(int iduser);
}
