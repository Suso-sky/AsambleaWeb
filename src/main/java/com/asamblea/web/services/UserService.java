package com.asamblea.web.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asamblea.web.models.UserModel;
import com.asamblea.web.repositories.UserRepository;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;
    
    public UserModel findById(Long userId) {
        Optional<UserModel> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }
}
