package ru.treut.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.treut.test.dao.PersonDAO;
import ru.treut.test.models.Person;

import java.nio.charset.Charset;

@Controller
@RequestMapping("/people")
public class People {
    private final PersonDAO personDAO;

    public People(PersonDAO personDAO) {
        this.personDAO = personDAO;
        System.out.println("My project encoding is : "+ Charset.defaultCharset());
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("people", personDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
//        model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person){
//        model.addAttribute("person", new Person());
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person){
        personDAO.save(person);
        return "redirect:/people";
    }
}
