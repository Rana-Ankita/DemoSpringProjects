package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public  static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employee employee = (Employee) context.getBean("emp1");
        System.out.println(employee.getName());
        System.out.println(employee.getAddresses());
        System.out.println(employee.getPhones());
        System.out.println(employee.getCourses());

    }
}
