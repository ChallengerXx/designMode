package com.factory.factory;

import com.factory.modelInterfaces.Shape;
import com.factory.modelInterfaces.impl.Circle;
import com.factory.modelInterfaces.impl.Rectangle;
import com.factory.modelInterfaces.impl.Square;

/**
 * 简单工厂
 */
public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }
}
