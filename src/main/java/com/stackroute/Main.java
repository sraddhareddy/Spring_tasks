package com.stackroute;

import com.stackroute.spring_demo.Actor;
import com.stackroute.spring_demo.Movie;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie m=(Movie)context.getBean("movie");
        System.out.println(m.toString());
        context.registerShutdownHook();
    }
}