package com.adapter.interfaces.impl;

import com.adapter.interfaces.LogDbOpeApi;
import com.mode.LogBean;

public class LogDbOpeApiImpl implements LogDbOpeApi {
    @Override
    public void createLog(LogBean logBean) {
        System.out.println("完成写入日志对象到数据库");
    }
}
