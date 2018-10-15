package com.factory.interfaces.impl;

import com.factory.interfaces.ShapeFactory;
import com.factory.interfaces.Shape;

/**
 * 圆形工厂类
 */
public class CircleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Circle();
    }
}
