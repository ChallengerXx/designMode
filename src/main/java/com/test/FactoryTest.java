package com.test;

import com.factory.factory.factoryInterfaces.ShapeFactory;
import com.factory.modelInterfaces.Shape;
import com.factory.factory.factoryInterfaces.impl.CircleFactory;
import com.factory.factory.factoryInterfaces.impl.SquareFactory;

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
