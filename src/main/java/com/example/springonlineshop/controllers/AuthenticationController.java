package com.example.springonlineshop.controllers;
import com.example.springonlineshop.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping("/authentication")
public String login(){
        return "authentication";}
}
