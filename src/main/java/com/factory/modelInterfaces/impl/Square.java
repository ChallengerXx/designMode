package com.factory.modelInterfaces.impl;

import com.factory.modelInterfaces.Shape;

public class Square implements Shape {
    public Square() {
        System.out.println("Square");
    }

    public void draw() {
        System.out.println("Draw Square");
    }
}
