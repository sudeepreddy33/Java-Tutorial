package com.sudeep.security.designpattern.factory;

import com.sudeep.security.model.Department;

public class FactoryMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CarFactory cf = new CarFactory();
		Car car = cf.getInstance("diesel");
		car.run();
		
		Department department = new Department();
		department.setName("Testing");
		department.setId(1);
		
		System.out.println(department.toString());
		
		Department d2 = (Department)department.clone();
		d2.setId(2);
		
		System.out.println(d2.toString());
	}
	

	

}
