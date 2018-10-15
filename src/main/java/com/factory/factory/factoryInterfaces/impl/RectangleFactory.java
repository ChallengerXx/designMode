package com.factory.factory.factoryInterfaces.impl;

import com.factory.factory.factoryInterfaces.ShapeFactory;
import com.factory.modelInterfaces.Shape;
import com.factory.modelInterfaces.impl.Rectangle;

/**
 * 长方形工厂类
 */
public class RectangleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Rectangle();
    }
}
