package com.springcore.autoWiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringConfig.xml");
        Employee employee = context.getBean("emp1", Employee.class);
        System.out.println(employee);
    }
}
