package com.adapter.interfaces.impl;

import com.adapter.interfaces.LogFileOperateApi;
import com.mode.LogBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 实现对日志文件的操作
 */
public class LogFileOperateApiImpl implements LogFileOperateApi {

    /**
     * 设置日志文件的路径和文件名称
     */
    private String logFileName = "file.log";

    /**
     * 构造方法传入文件的路径和名称
     *
     * @param logFileName
     */
    public LogFileOperateApiImpl(String logFileName) {
        this.logFileName = logFileName;
    }

    @Override
    public List<LogBean> readLogFile() {
        //忽略业务代码
//        List<LogBean> list = Arrays.asList(new LogBean("1", "1"), new LogBean("2", "1"));
        List<LogBean> list = new ArrayList<>();
        return list;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {
        System.out.println("完成写入日志列表到日志文件!");
    }
}
