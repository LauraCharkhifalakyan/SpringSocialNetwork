package com.example.spring_social_network.controller;

import com.example.spring_social_network.model.User;
import com.example.spring_social_network.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/home")
    public String home(ModelMap modelMap) {
        List <User> all = userRepository.findAll();
        modelMap.addAttribute("users", all);
        return "home";
    }
}