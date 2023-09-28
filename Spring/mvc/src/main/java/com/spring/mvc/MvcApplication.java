package com.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.mvc.collections.ArrayListtest;
import com.spring.mvc.collections.DataTypes;
import com.spring.mvc.collections.HashSetTest;
import com.spring.mvc.collections.LinkedListTest;
import com.spring.mvc.collections.MapTest;
import com.spring.mvc.java8.FunctionalInterfaceTest;
import com.spring.mvc.string.StringExamples;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MvcApplication.class, args);
		
//		ArrayListtest dao =   context.getBean(ArrayListtest.class);
//		dao.listOperations();
		
		StringExamples string = context.getBean(StringExamples.class);
		string.stringExamples();
		
//		LinkedListTest dao =   context.getBean(LinkedListTest.class);
//		dao.linkedListOperations();
//		
//		HashSetTest dao = context.getBean(HashSetTest.class);
//		dao.hashSetOperations(); 
//		
//		DataTypes dao = context.getBean(DataTypes.class);
//		dao.dataTypes();
		
//		FunctionalInterfaceTest dao = context.getBean(FunctionalInterfaceTest.class);
		
//		FunctionalInterfaceTest dao = (i, j) ->{ return (i + j); };
//
//		;
//		int a = dao.addNumbers(8, 9);
//		System.out.println(a);
		
		 
		
	}

}
