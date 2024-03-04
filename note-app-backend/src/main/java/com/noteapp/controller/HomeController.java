package com.noteapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @CrossOrigin
    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }

    @CrossOrigin
    @GetMapping("/admin")
    public String admin() {
        return "this is admin page";
    }

}
