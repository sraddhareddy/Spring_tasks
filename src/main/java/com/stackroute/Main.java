package com.stackroute;

import com.stackroute.spring_demo.Actor;
import com.stackroute.spring_demo.Movie;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
        Movie s=c.getBean("movie1", Movie.class);
        Movie s1=c.getBean("movie1",Movie.class);
        Movie s2=c.getBean("movie3",Movie.class);
        s.displayActorInfo();
        s1.displayActorInfo();
        s2.displayActorInfo();
        System.out.println(s==s1);
        System.out.println(s1==s2);
        /*BeanFactory f=new ClassPathXmlApplicationContext("beans.xml");
        Movie m=(Movie)f.getBean("movie1");
        m.displayActorInfo();*/


        /*BeanDefinitionRegistry beanfactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanfactory);
        reader.loadBeanDefinitions(new FileSystemResource("/home/nandini/SpringTask/src/main/resources/beans.xml"));
        Movie o=((DefaultListableBeanFactory)beanfactory).getBean(Movie.class);
        o.displayActorInfo();*/


    }
}