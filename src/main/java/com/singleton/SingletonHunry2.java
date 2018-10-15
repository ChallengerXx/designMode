package com.singleton;

/**
 * 饿汉模式（枚举实现）
 */
public enum SingletonHunry2 {
    //定义一个枚举元素，它就是SingletonHunry2的一个实例
    INSTANCE;

    public void doSomething(){
        System.out.println("枚举方法实现单例");
    }
    //测试SingletonHunry2.INSTANCE.doSomething();
}
