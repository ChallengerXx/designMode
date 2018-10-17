package com.adapter.adapter;

import com.adapter.interfaces.LogDbOpeApi;
import com.adapter.interfaces.LogFileOperateApi;
import com.mode.LogBean;

import java.util.List;

/**
 * 双向适配器
 */
public class TwiceAdapter implements LogDbOpeApi, LogFileOperateApi {

    //持有需要被适配的文件存储日志的接口对象
    private LogFileOperateApi logFileOperateApi;

    //持有需要被适配的 DB 存储日志的接口对象
    private LogDbOpeApi logDbOpeApi;

    public TwiceAdapter(LogFileOperateApi logFileOperateApi, LogDbOpeApi logDbOpeApi) {
        this.logFileOperateApi = logFileOperateApi;
        this.logDbOpeApi = logDbOpeApi;
    }

    @Override
    public void createLog(LogBean logBean) {

    }

    @Override
    public List<LogBean> readLogFile() {
        return null;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {

    }
}
