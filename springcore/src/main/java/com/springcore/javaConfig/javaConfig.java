package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaConfig")
/*if we are using @Component then we need to use @ComponentScan, if we are not using @Component then no need
to use @ComponentScan*/
public class javaConfig {
    /* Creatingew object of Student class (if we are using @Bean then no need to use @Component. this is just a
     a another way to create object) */

    /*//@Bean(name = {"getStudent","student","con"})
    //we can use multiple name for bean, spring container will attach all the name with the bean and then
    //we can get bean by using any name
    @Bean
    public Student getStudent(){
        Student student = new Student();
        return student;
    }*/

    @Bean
    public Teacher getKT(){
        return new Teacher();
    }
}
