package com.factory.interfaces.impl;

import com.factory.interfaces.ShapeFactory;
import com.factory.interfaces.Shape;

/**
 * 长方形工厂类
 */
public class RectangleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Rectangle();
    }
}
