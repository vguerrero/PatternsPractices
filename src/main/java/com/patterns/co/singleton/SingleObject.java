package com.patterns.co.singleton;

public class SingleObject {

	private String name;
	private static SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		instance.name = "Petronilla";
		return instance;
	}

	public void getMessage() {
		System.out.println("Hello World! from: " + name);
	}

}
