package ru.treut.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HController {
    @GetMapping("/hello")
    public String hell(){
        return "hello";
    }
}
