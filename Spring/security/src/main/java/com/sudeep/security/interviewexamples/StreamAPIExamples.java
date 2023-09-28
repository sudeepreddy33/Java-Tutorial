//package com.sudeep.security.interviewexamples;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.sudeep.security.model.Department;
//
//public class StreamAPIExamples {
//	
//	public static void main(String[] args) {
//		List <Department> departments = new ArrayList < Department > ();
//		departments.add(new Department(2, "service"));
//		departments.add(new Department(1, "se"));
//		departments.add(new Department(1, "se"));
//		departments.add(new Department(3, "ser"));
//		departments.add(new Department(4, "servv"));
//		departments.add(new Department(5, "jdfkjfj"));
//		
//		//using forEach
////		departments.forEach(System.out::println);
//		
////		departments.stream().map(e -> e.id + 1).forEach(System.out::println);;
//		
//		departments.stream().filter( e-> e.getId() == 1).forEach(System.out::println);
//		
////		departments.stream().sorted((e1, e2) -> (e1.getId() > e2.getId()) ? 1 : -1).forEach(System.out::println);
//		
////		departments.stream().distinct().forEach(System.out::println);
//		
//
//		
////		
////		Department department = departments.stream().max((e1, e2)-> e1.getId()>e2.getId() ? 1 :-1).get();
////		System.out.println(a);
//	}
//
//}
