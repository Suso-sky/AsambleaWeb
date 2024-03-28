package com.asamblea.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asamblea.web.models.UserModel;
import com.asamblea.web.services.UserService;

@Controller
public class LoginController{

    @Autowired
    private UserService userService;
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @PostMapping("/doLogin")
    public String doLogin(@RequestParam("userId") Long userId, @RequestParam("password") String password, Model model) {
        UserModel user = userService.findById(userId);
        if (user != null && user.getPassword().equals(password)) {
            if (user.getIsAdmin()) {
                return "adminPage"; 
            } else {
                return "ownerPage";
            }
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
    }
}

