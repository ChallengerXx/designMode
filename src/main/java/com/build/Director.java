package com.build;

import com.mode.Product;

/**
 * 指挥者类
 * 作用：1.一方面它隔离了客户与生产过程
 * 2.负责控制产品的生成过程
 */
public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getProduct();
    }
}
