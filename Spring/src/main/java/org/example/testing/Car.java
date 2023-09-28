package org.example.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Car implements Vehicle {

    private String model;

    private String make;

    private Gear gear;

    @Autowired
    @Qualifier("highGear")
    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public void printGear() {
        System.out.println(gear.getKind());
        System.out.println(gear.getName());
        gear.displayGear();
    }

    @Override
    public void drive() {

    }

    public void setMake(String make) {
        this.make = make;
    }


    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", gear=" + gear +
                '}';
    }
}
