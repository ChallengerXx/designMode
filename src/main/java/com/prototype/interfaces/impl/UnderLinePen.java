package com.prototype.interfaces.impl;

import com.prototype.interfaces.Product;

/**
 * 具体实例原型2下划线样式
 */
public class UnderLinePen implements Product {

    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product craeteClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
