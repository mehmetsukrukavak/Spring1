package com.mehmetsukrukavak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Alien obj1 = (Alien) context.getBean("alien");
       //obj1.setAge(25);
       obj1.code();
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);
    }
}
