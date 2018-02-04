package com.patterns.co.singleton;

public class App {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.getMessage();
		SingleObject object2 = SingleObject.getInstance();
		object2.getMessage();
	}

}
