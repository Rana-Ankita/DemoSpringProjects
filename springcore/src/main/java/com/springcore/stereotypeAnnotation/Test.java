package com.springcore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeAnnotationConfig.xml");
        Student student=context.getBean("student", Student.class);
        //Student student=context.getBean("test", Student.class);
        System.out.println(student);
        System.out.println(student.getAdress());
        System.out.println(student.getAdress().getClass().getName());
         /* System.out.println("************Bean Scope using @scope annotation example*************");
      System.out.println(student.hashCode());
        Student student1=context.getBean("student", Student.class);
        System.out.println(student1.hashCode());*/

        /* System.out.println("************Bean Scope using XML example*************");
       /*Teacher teacher1= context.getBean("teacher", Teacher.class);
       Teacher teacher2=context.getBean("teacher", Teacher.class);
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());*/
    }

}
