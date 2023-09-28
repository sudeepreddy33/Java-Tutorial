package com.spring.mvc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import jakarta.annotation.PostConstruct;

@Configuration
//@ComponentScan
public class JdbcConfig {

	@Autowired
	private Environment env;

	@PostConstruct
	public void createConnection() throws ClassNotFoundException, SQLException {

		Class.forName(env.getProperty("mysql.driver"));
		DriverManager.getConnection(env.getProperty("mysql.url"), env.getProperty("mysql.username"),
				env.getProperty("mysql.password"));
		
		System.out.println("Database Connection established");
	}

}
