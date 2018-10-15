package com.singleton;

import com.mode.InstanceBean;

/**
 * 懒汉模式（非线程安全）
 */
public class SingletonLazy {
    private static InstanceBean instanceBean;

    private SingletonLazy() {
    }

    //没有假如synchronized关键字的版本是线程不安全的
    public static InstanceBean getInstanceBean() {
        //判断单例是否存在，不存在则创建实例
        if (instanceBean == null) {
            instanceBean = new InstanceBean();
        }
        return instanceBean;
    }
}
