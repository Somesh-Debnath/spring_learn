package com.cts.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
        ("com/cts/map/mapconfig.xml");
        Customer customer = (Customer) ctx.getBean("customer");
        System.out.println(customer);
        System.out.println(customer.getProducts());
        System.out.println(customer.getProducts().getClass().getName());
    }
}
