package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("consturctorInjectionConfig.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);

        Addition add = (Addition) context.getBean("add");
        add.doSum();
    }
}
