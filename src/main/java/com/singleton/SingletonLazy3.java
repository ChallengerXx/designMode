package com.singleton;

import com.mode.InstanceBean;

/**
 * 懒汉模式（双重检查加锁版本）
 * 这种方式相比于使用synchronized关键字的方法，可以大大减少getInstanceBean() 的时间消费。
 */
public class SingletonLazy3 {
    //volatile保证，当instanceBean变量被初始化成InstanceBean实例时，多个线程可以正确处理instanceBean变量
    private volatile static InstanceBean instanceBean;

    private SingletonLazy3() {
    }

    private static InstanceBean getInstanceBean() {
        //检查实例，如果不存在，则进入同步代码块
        if (instanceBean == null) {
            //只有第一次才彻底执行这里的代码
            synchronized (SingletonLazy3.class) {
                //进入同步代码块后，再检查一次，如果仍是null，才创建实例
                if (instanceBean == null){
                    instanceBean = new InstanceBean();
                }
            }
        }
        return instanceBean;
    }
}
