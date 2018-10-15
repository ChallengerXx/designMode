package com.singleton;

import com.mode.InstanceBean;

/**
 * 饿汉方式（线程安全）
 */
public class SingletonHungry {

    private static InstanceBean instanceBean = new InstanceBean();

    private SingletonHungry(){}

    public static InstanceBean getInstanceBean(){
        return instanceBean;
    }
}
