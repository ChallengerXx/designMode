package com.factory.modelInterfaces.impl;

import com.factory.modelInterfaces.Shape;

public class Circle implements Shape {

    public Circle(){
        System.out.println("Circle");
    }
    public void draw() {
        System.out.println("Draw Circle");
    }
}
