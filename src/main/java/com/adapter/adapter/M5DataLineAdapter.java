package com.adapter.adapter;

import com.adapter.adaptee.M4DataLine;
import com.adapter.interfaces.Target;


/**
 * 适配器类，继承被适配类，同时实现标准接口
 */
public class M5DataLineAdapter implements Target {

    /**
     * 持有需要被适配的接口对象
     */
    private M4DataLine m4DataLine;

    /**
     * 构造方法，传入需要被适配的对象
     *
     * @param m4DataLine 需要被适配的对象
     */
    public M5DataLineAdapter(M4DataLine m4DataLine) {
        this.m4DataLine = m4DataLine;
    }

    @Override
    public void connection() {
        System.out.println("其他操作");
        m4DataLine.specialConnection();
    }
}
