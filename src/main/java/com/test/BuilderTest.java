package com.test;

import com.build.AbstractBuilder;
import com.build.Director;
import com.build.trueBuilde.ConcreteBuilder;
import com.mode.Product;

public class BuilderTest {

    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }
}
