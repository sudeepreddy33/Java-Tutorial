package org.example.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

    public void teach(){
        System.out.println("method in ScienceTeacher");
    }
}
