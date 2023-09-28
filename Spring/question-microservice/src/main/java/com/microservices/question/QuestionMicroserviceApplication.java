package com.microservices.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.microservices.question.serializable.SerializableTestClass;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.microservices.question.repository")
public class QuestionMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionMicroserviceApplication.class, args);
		
		SerializableTestClass st = new SerializableTestClass();
		st.serializableTesReader();
	}

}
