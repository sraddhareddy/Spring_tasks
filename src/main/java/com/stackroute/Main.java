package com.stackroute;

import com.stackroute.spring_demo.Movie;
import com.stackroute.spring_demo.Actor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
        Movie s=c.getBean("movie", Movie.class);
        s.displayActorInfo();

        //Resource r=new ClassPathResource("beans.xml");
        BeanFactory f=new ClassPathXmlApplicationContext("beans.xml");
        Movie m=(Movie)f.getBean("movie");
        m.displayActorInfo();

        BeanDefinitionRegistry beanfactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanfactory);
        reader.loadBeanDefinitions(new FileSystemResource("beans.xml"));
        Movie o=((DefaultListableBeanFactory)beanfactory).getBean(Movie.class);
        o.displayActorInfo();

    }
}