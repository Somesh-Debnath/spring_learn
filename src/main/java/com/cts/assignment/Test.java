package com.cts.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
        ("com/cts/assignment/assignmentconfig.xml");
        System.out.println(ctx.getBean("shoppingcart"));
        
    }
}
