package com.stackroute;

import com.stackroute.spring_demo.Actor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Actor bean=(Actor) context.getBean("actor");
        context.close();
    }
}