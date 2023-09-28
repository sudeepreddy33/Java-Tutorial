package com.sudeep.security.designpattern.singleton;

public class InitializationOnDemandSingleton {

	private InitializationOnDemandSingleton() {

	}

	private static class InnerClass {
		private static InitializationOnDemandSingleton instance = new InitializationOnDemandSingleton();

	}

	public static InitializationOnDemandSingleton getInstance() {
		return InnerClass.instance;
	}

}
