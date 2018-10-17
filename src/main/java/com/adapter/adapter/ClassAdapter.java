package com.adapter.adapter;


import com.adapter.interfaces.LogDbOpeApi;
import com.adapter.interfaces.impl.LogFileOperateApiImpl;
import com.mode.LogBean;

/**
 * 类适配器
 */
public class ClassAdapter extends LogFileOperateApiImpl implements LogDbOpeApi {

    /**
     * 构造方法传入文件的路径和名称
     *
     * @param logFileName
     */
    public ClassAdapter(String logFileName) {
        super(logFileName);
    }

    @Override
    public void createLog(LogBean logBean) {

    }
}
