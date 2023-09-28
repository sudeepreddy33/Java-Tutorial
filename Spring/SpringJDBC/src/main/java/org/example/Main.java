package org.example;

import org.example.config.JdbcConfig;
import org.example.dao.DriversLicense;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Step1: Initialize the container to create beans/objects.
        //Step2: Perform Dependency injection to particular class using spring.xml (JdbcConfig.class)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        JdbcConfig config = context.getBean("jdbcConfig", JdbcConfig.class);

        config.fetchAllRows();
        //Step 5: Using this we can call destroy method @PreDestroy
        context.close();
    }
}