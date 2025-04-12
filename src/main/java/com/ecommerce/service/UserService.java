package com.ecommerce.service;

import com.ecommerce.model.Users;
import com.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users registerUser(Users user) {
        return userRepository.save(user);
    }

    public Users authenticate(String email, String password) {
        Users user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}