package ru.korostelev.DZSem2.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping()
    public String welcome() {
        return "Welcome to Spring !";
    }
}
