package com.singleton;

import com.mode.InstanceBean;

/**
 * 懒汉模式（synchronized线程安全版本）
 * 程序中每次使用getInstanceBean() 都要经过synchronized加锁这一层，这难免会增加getInstance()的方法的时间消费，而且还可能会发生阻塞
 */
public class SingletonLazy2 {
    private static InstanceBean instanceBean;

    private SingletonLazy2() {
    }

    public synchronized static InstanceBean getInstanceBean() {
        if (instanceBean == null) {
            instanceBean = new InstanceBean();
        }
        return instanceBean;
    }
}
