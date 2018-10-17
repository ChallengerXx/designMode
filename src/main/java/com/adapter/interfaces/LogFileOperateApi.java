package com.adapter.interfaces;

import com.mode.LogBean;

import java.util.List;

/**
 * 业务：日志接口
 */
public interface LogFileOperateApi {

    /**
     * 读日志文件 从文件里获取存储的日志对象
     *
     * @return 存储的日志列表对象
     */
    public List<LogBean> readLogFile();

    /**
     * 写日志文件 把日志列表写到日志文件中去
     *
     * @param list 要写到日志文件中的日志列表
     */
    public void writeLogFile(List<LogBean> list);

}
