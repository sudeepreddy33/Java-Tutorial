package org.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    public void displayInfo(){
        System.out.println("This is Principal");
    }
}
