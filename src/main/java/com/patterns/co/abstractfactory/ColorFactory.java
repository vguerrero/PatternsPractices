package com.patterns.co.abstractfactory;

import com.patterns.co.factory.Shape;

/***
 * concrete factory
 * 
 * @author victor
 *
 */
public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
