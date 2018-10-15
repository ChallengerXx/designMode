package com.test;

import com.factory.modelInterfaces.Shape;
import com.factory.factory.ShapeFactory;
import com.factory.factory.ShapeFactory2;
import com.factory.modelInterfaces.impl.Circle;
import com.factory.modelInterfaces.impl.Rectangle;
import com.factory.modelInterfaces.impl.Square;

public class ShapeFactoryTest {

    public static void main(String[] args) {

        //获取Circle对象，并调用它的Draw方法
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();
        //获取Rectangle对象，并调用它的Draw方法
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();
        //获取Square对象，并调用它的Draw方法
        Shape square = ShapeFactory.getShape("Square");
        square.draw();
        System.out.println("=======================================");

        Shape circle1 = ShapeFactory2.getShape(Circle.class);
        circle1.draw();

        Shape rectangle1 = ShapeFactory2.getShape(Rectangle.class);
        rectangle1.draw();

        Shape square1 = ShapeFactory2.getShape(Square.class);
        square1.draw();

        Shape shape = ShapeFactory2.getShape(null);
        System.out.println(shape);
    }
}
