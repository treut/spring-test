package ru.treut.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/ex")
public class Second {

    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }
}
