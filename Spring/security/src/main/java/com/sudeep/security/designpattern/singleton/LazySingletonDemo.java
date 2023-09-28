package com.sudeep.security.designpattern.singleton;

public class LazySingletonDemo {
	
	//this is an approach but doesn't support multi-threading because it's not thread safe

	private static LazySingletonDemo instance;

	private LazySingletonDemo() {

	}

	public static LazySingletonDemo getInstance() {
		if (instance == null) {
			instance = new LazySingletonDemo();
		}
		return instance;
	}

}
