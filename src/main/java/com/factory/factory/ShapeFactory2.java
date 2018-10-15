package com.factory.factory;

import com.factory.interfaces.Shape;

/**
 * 使用反射机制改良简单工厂
 */
public class ShapeFactory2 {

    //根据class类型利用反射获取对象
    public static Shape getShape(Class<? extends Shape> clazz) {
        Object obj = null;

        if (clazz != null){
            try {
                obj = Class.forName(clazz.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        Shape shape = (Shape) obj;
        return shape;
    }
}
