package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //ApplicationContext context= new ClassPathXmlApplicationContext("C:\\Users\\ankrana2\\Documents\\SpringBootProject\\springcore\\src\\main\\java\\config.xml");
        //ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:config.xml");
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("Student");
        Student student2 = (Student) context.getBean("Student1");
        Student student3 = (Student) context.getBean("Student2");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}