package org.example;


import org.example.testing.Car;
import org.example.testing.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Car vehicle = (Car) ac.getBean("car");

//        System.out.println(vehicle);
        vehicle.printGear();



    }
}
