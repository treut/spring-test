package ru.treut.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class First {

    @GetMapping("/halo")
    //HttpServletRequest.getParameter()
    public String halo(@RequestParam(value="name", required = false) String name, Model moda){
        moda.addAttribute("name", name);
        System.out.println(name);
        return "first/halo";
    }

    @GetMapping("/bye")
    public String bye(){
        return "first/bye";
    }
}
