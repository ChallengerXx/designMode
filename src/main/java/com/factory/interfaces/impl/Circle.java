package com.factory.interfaces.impl;

import com.factory.interfaces.Shape;

public class Circle implements Shape {

    public Circle(){
        System.out.println("Circle");
    }
    public void draw() {
        System.out.println("Draw Circle");
    }
}
