package com.patterns.co.abstractfactory;

import com.patterns.co.factory.Circle;
import com.patterns.co.factory.Rectangle;
import com.patterns.co.factory.Shape;
import com.patterns.co.factory.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
