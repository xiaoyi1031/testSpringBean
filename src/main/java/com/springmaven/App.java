package com.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Vehicle obj = (Vehicle) context.getBean("vehicle"); //get bean will find the object
        obj.drive();
    }
}
