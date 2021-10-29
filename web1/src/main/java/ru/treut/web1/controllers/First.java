package ru.treut.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ff")
public class First {

    @GetMapping("/halo")
    public String halo(){
        return "first/halo";
    }

    @GetMapping("/bye")
    public String bye(){
        return "first/bye";
    }
}
