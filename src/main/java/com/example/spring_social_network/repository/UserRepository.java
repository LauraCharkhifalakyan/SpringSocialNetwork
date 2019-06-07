package com.example.spring_social_network.repository;

import com.example.spring_social_network.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Integer> {

    User findByEmail(String email);

    List <User> findAllByNameContainsOrSurnameContains(String name, String surname);
}
