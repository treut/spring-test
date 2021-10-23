package ru.treut.spr1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class CMusic implements Music {
        public String getSong(){
        return "Classical";
    }
}
