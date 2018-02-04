package com.patterns.co.factory;

/**
 * Got from https://www.tutorialspoint.com/design_pattern/
 *
 */
public class App {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.createFactory();
		Shape circle1 = shapeFactory.getShape("CIRCLE");
		circle1.draw();
		Shape sq = shapeFactory.getShape("SQUARE");
		sq.draw();
		Shape unknow = shapeFactory.getShape("NATURAL");
		unknow.draw();
		System.out.println("I ran");
	}
}
