package ru.treut.spr1;

import org.springframework.stereotype.Component;

@Component
public class CMusic implements Music {
    public String getSong(){
        return "Classical";
    }
}
