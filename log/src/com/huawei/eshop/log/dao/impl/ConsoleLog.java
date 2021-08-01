package com.huawei.eshop.log.dao.impl;

import com.huawei.eshop.log.dao.ISysLog;
import com.huawei.eshop.log.entity.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLog  implements ISysLog {
    @Override
    public void info(String msg) {
        SimpleDateFormat yyMMddHHmmssZ = new SimpleDateFormat("yyMMddHHmmssZ");
        log log = new log(INFO,msg,yyMMddHHmmssZ.format(new Date()));
        System.out.println(log);
    }

    @Override
    public void warn(String msg) {
        SimpleDateFormat yyMMddHHmmssZ = new SimpleDateFormat("yyMMddHHmmssZ");
        log log = new log(WARN,msg,yyMMddHHmmssZ.format(new Date()));
        System.out.println(log);
    }

    @Override
    public void error(String msg) {
        SimpleDateFormat yyMMddHHmmssZ = new SimpleDateFormat("yyMMddHHmmssZ");
        log log = new log(ERROR,msg,yyMMddHHmmssZ.format(new Date()));
        System.out.println(log);
    }
}
