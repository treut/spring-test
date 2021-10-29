package ru.treut.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ff")
public class First {

    @GetMapping("/halo")
    public String halo(@RequestParam(value="name", required=false) String name){
//    public String halo(HttpServletRequest request){
//        String name=request.getParameter("name");

        System.out.println("NAME: "+name);

        return "first/halo";
    }

    @GetMapping("/bye")
    public String bye(){
        return "first/bye";
    }
}
