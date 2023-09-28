package com.sudeep.security.designpattern.factory;

public class CarFactory {

	public Car getInstance(String type) {

		if (type.equals("diesel")) {
			return new DieselCar();
		} else if (type.equals("petrol")) {
			return new PetrolCar();
		} else {
			return new EVCar();
		}

	}

}
