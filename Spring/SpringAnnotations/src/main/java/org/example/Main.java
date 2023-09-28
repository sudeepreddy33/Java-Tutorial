package org.example;

import org.example.annotations.College;
import org.example.annotations.config.CollegeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college= context.getBean("college", College.class);
        college.displayInfoCollege();

    }
}