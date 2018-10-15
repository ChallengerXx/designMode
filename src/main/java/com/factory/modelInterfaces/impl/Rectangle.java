package com.factory.modelInterfaces.impl;

import com.factory.modelInterfaces.Shape;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle");
    }

    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
