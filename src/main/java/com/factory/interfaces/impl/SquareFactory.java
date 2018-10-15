package com.factory.interfaces.impl;

import com.factory.interfaces.ShapeFactory;
import com.factory.interfaces.Shape;

/**
 * 正方形工厂类
 */
public class SquareFactory implements ShapeFactory {
    public Shape getShape() {
        return new Square();
    }
}
