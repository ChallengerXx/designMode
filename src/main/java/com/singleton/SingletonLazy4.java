package com.singleton;

import com.mode.InstanceBean;

/**
 * 懒汉式（登记式/静态内部类方式）
 * 只有通过显式调用 getInstanceBean 方法时，才会显式装载 SingletonLazyHolder 类
 * 从而实例化 instance（只有第一次使用这个单例的实例的时候才加载，同时不会有线程安全问题）
 */
public class SingletonLazy4 {
    private static class SingletonLazyHolder {
        private static final InstanceBean INSTANCE_BEAN = new InstanceBean();
    }

    private SingletonLazy4() {
    }

    public static final InstanceBean getInstanceBean() {
        return SingletonLazyHolder.INSTANCE_BEAN;
    }
}
