package com.factory.interfaces.impl;

import com.factory.interfaces.Shape;

public class Square implements Shape {
    public Square() {
        System.out.println("Square");
    }

    public void draw() {
        System.out.println("Draw Square");
    }
}
