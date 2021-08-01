package com.huawei.eshop.log.dao.impl;

import com.huawei.eshop.common.dao.IDateAccess;
import com.huawei.eshop.common.dao.impl.TXTDataAccess;
import com.huawei.eshop.log.dao.ISysLog;
import com.huawei.eshop.log.entity.log;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TxtLog implements ISysLog {

    @Override
    public void info(String msg) throws URISyntaxException, IOException {

        SimpleDateFormat yyMMddHHmmssZ = new SimpleDateFormat("yyyyMMddHHmmss");
        log log = new log(INFO,msg,yyMMddHHmmssZ.format(new Date()));

        IDateAccess iDateAccess = new TXTDataAccess();
        iDateAccess.writeloginlog(log.class,log.toString());
    }

    @Override
    public void warn(String msg) throws URISyntaxException, IOException {
        SimpleDateFormat yyMMddHHmmssZ = new SimpleDateFormat("yyyyMMddHHmmss");
        log log = new log(WARN,msg,yyMMddHHmmssZ.format(new Date()));

        IDateAccess iDateAccess = new TXTDataAccess();
        iDateAccess.writeloginlog(log.class,log.toString());
    }

    @Override
    public void error(String msg) {

    }
}
