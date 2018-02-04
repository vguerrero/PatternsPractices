package com.patterns.co.abstractfactory;

import com.patterns.co.factory.Shape;

public class App {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("RED");
		red.fill();

	}

}
