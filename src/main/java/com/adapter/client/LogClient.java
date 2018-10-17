package com.adapter.client;

import com.adapter.adapter.LogAdapter;
import com.adapter.interfaces.LogDbOpeApi;
import com.adapter.interfaces.LogFileOperateApi;
import com.adapter.interfaces.impl.LogFileOperateApiImpl;
import com.mode.LogBean;

public class LogClient {

    public static void main(String[] args) {
        LogBean logBean = new LogBean("3", "3");
        LogFileOperateApi logFileOperateApi = new LogFileOperateApiImpl("");
        //创建日志操作接口对象
        LogDbOpeApi api = new LogAdapter(logFileOperateApi);
        api.createLog(logBean);
    }
}
