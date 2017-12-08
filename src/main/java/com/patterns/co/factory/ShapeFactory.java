package com.patterns.co.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		switch (shapeType) {
		case "CIRCLE":
			return new Circle();
		case "SQUARE":
			return new Square();
		default:
			return new Shape() {

				@Override
				public void draw() {
					System.out.println("I'm a anonimous shape");

				}
			};

		}
	}

	public static ShapeFactory createFactory() {
		return new ShapeFactory();
	}

}
