package com.test;

import com.mode.InstanceBean;
import com.singleton.SingletonHungry;
import com.singleton.SingletonHunry2;
import com.singleton.SingletonLazy4;

public class SingletonHungryTest {
    public static void main(String[] args) {
        InstanceBean instanceBean = SingletonHungry.getInstanceBean();
        System.out.println(instanceBean);
        InstanceBean instanceBean1 = SingletonLazy4.getInstanceBean();
        System.out.println(instanceBean1);
        SingletonHunry2.INSTANCE.doSomething();
    }
}
