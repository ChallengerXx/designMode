package com.build.trueBuilde;

import com.build.AbstractBuilder;

/**
 * 具体建造者。实现抽象接口，构建和装配各个部件
 */
public class ConcreteBuilder extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("partA");
        System.out.println("Assemble partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("partB");
        System.out.println("Assemble partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("partC");
        System.out.println("Assemble partC");
    }
}
