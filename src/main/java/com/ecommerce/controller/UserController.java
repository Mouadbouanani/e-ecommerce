package com.ecommerce.controller;

import com.ecommerce.model.Users;
import com.ecommerce.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public Users login(@RequestParam String email, @RequestParam String password) {
        return userService.authenticate(email, password);
    }
}