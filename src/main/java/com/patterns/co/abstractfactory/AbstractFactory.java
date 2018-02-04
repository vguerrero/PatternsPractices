package com.patterns.co.abstractfactory;

import com.patterns.co.factory.Shape;

public abstract class AbstractFactory {

	abstract Color getColor(String colorName);

	abstract Shape getShape(String shapeName);
}
