package com.microservices.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.microservices.quiz.repository")
@EnableFeignClients
public class QuizMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizMicroserviceApplication.class, args);
	}

}
