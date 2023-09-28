package org.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    public void teach(){
        System.out.println("method in MathTeacher");
    }
}
