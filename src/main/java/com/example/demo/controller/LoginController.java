package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    private UserRepository usuarioRepository;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User usuarioFromDB = usuarioRepository.findByUsername(user.getUsername());
        if (usuarioFromDB != null && usuarioFromDB.getPassword().equals(user.getPassword())) {
            return "Login exitoso";
        } else {
            return "Credenciales incorrectas";
        }
    }
}

