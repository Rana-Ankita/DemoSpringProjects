package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");
        context.registerShutdownHook();
/*
        //using XML
        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);

        System.out.println("*******************************");

        //using Interfaces
        Pepsi p1 = (Pepsi) context.getBean("p1");
        System.out.println(p1);
*/
        IceCream iceCream = (IceCream) context.getBean("i1");
        System.out.println(iceCream);

    }
}
