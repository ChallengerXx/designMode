package com.adapter.adapter;

import com.adapter.interfaces.LogDbOpeApi;
import com.adapter.interfaces.LogFileOperateApi;
import com.mode.LogBean;

import java.util.List;

/**
 * 适配器对象，将记录日志到文件的功能适配成数据库功能
 */
public class LogAdapter implements LogDbOpeApi {

    private LogFileOperateApi adaptee;

    public LogAdapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogBean logBean) {
        List<LogBean> list = adaptee.readLogFile();
        list.add(logBean);
        adaptee.writeLogFile(list);
    }
}
