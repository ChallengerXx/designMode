package com.mode;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 日志数据对象
 */

@Data
@AllArgsConstructor
public class LogBean {

    private String logId; //日志编号

    private String opeUserId; //日志操作人员

    public LogBean() {
    }
}
