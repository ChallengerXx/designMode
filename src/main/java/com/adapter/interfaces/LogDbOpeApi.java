package com.adapter.interfaces;

import com.mode.LogBean;

/**
 * 定义数据库操作接口
 */
public interface LogDbOpeApi {

    /**
     * 新增日志
     *
     * @param logBean 需要新增的日志对象
     */
    public void createLog(LogBean logBean);
}
