package ru.treut.spring1;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    public String getSong(){
        return "rock this";
    }
}
