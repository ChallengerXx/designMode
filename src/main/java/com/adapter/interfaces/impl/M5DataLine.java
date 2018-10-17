package com.adapter.interfaces.impl;

import com.adapter.interfaces.Target;
/**
 * 客户端使用的接口实现，与业务相关
 */
public class M5DataLine implements Target {
    @Override
    public void connection() {
        System.out.println("使用小米5数据线连接");
    }
}
