package com.test;

import com.factory.interfaces.ShapeFactory;
import com.factory.interfaces.Shape;
import com.factory.interfaces.impl.CircleFactory;
import com.factory.interfaces.impl.SquareFactory;

public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.getShape();
        square.draw();
    }
}
