package com.factory.factory.factoryInterfaces.impl;

import com.factory.factory.factoryInterfaces.ShapeFactory;
import com.factory.modelInterfaces.Shape;
import com.factory.modelInterfaces.impl.Circle;

/**
 * 圆形工厂类
 */
public class CircleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Circle();
    }
}
