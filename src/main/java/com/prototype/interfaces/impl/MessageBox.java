package com.prototype.interfaces.impl;

import com.prototype.interfaces.Product;

/**
 * 具体实例原型1装饰方框
 */
public class MessageBox implements Product {

    //保存的是装饰方框使用的字符样式
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 2; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < length + 2; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    //该方法用于复制自己
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
