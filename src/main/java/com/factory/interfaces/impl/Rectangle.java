package com.factory.interfaces.impl;

import com.factory.interfaces.Shape;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle");
    }

    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
