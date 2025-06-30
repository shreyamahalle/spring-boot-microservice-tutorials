package com.shreya.microservices.service;

import com.shreya.microservices.model.User;
import com.shreya.microservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }
}
