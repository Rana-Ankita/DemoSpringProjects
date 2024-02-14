package com.springcore.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SPELConfig.xml");
        Demo demo1 = context.getBean("demo", Demo.class);
        System.out.println(demo1);

        /*SpelExpressionParser temp = new SpelExpressionParser();
        //here we will give direct values, in case of @Value we will give expression
        Expression expression=temp.parseExpression("22+24");
        System.out.println(expression.getValue());*/
    }
}
