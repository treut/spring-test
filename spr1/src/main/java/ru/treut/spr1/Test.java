package ru.treut.spr1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        TBean tb = context.getBean("tbean", TBean.class);
        System.out.println(tb.getName());

        context.close();
    }
}
