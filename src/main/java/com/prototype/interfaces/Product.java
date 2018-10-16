package com.prototype.interfaces;

/**
 * 复制功能接口
 * 只有实现了该接口的类的实例才可以调用clone()方法复制实例，否则会抛出异常
 */
public interface Product extends Cloneable {

    //use是用于“使用”的方法，具体怎么“使用”，交给子类去实现
    public void use(String s);

    //createClone是用于复制实例的方法
    public Product craeteClone();
}
