package com.factory.factory.factoryInterfaces.impl;

import com.factory.factory.factoryInterfaces.ShapeFactory;
import com.factory.modelInterfaces.Shape;
import com.factory.modelInterfaces.impl.Square;

/**
 * 正方形工厂类
 */
public class SquareFactory implements ShapeFactory {
    public Shape getShape() {
        return new Square();
    }
}
