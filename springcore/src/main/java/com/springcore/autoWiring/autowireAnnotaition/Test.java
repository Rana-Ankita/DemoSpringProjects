package com.springcore.autoWiring.autowireAnnotaition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringAnnotationConfig.xml");
        Employee employee = context.getBean("emp1", Employee.class);
        System.out.println(employee);
    }
}
