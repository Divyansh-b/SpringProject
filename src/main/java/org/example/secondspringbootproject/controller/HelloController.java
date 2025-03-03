package org.example.secondspringbootproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    // UC2 - Learned to set a route and access another with it which will call the same page
    @GetMapping("/")
    public static String hello(){
        return "My name is Divyansh";
    }
}