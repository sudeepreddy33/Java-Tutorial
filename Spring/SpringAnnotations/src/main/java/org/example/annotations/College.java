package org.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class College {

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("mathTeacher")
    private Teacher teacher;


    public void displayInfoCollege(){
        System.out.println("from College::: ");
        principal.displayInfo();
        teacher.teach();
    }


}
