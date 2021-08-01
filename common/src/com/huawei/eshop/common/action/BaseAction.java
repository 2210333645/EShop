package com.huawei.eshop.common.action;

import com.huawei.eshop.log.dao.ISysLog;
import com.huawei.eshop.log.dao.impl.ConsoleLog;
import com.huawei.eshop.log.dao.impl.TxtLog;

/**
 * Action控制器的基类
 * 1.封装请求数据
 * 2.校验权限
 * 3.调用服务层
 * 4.日志的记录
 * 5.返回消息到客户端
 */
public class BaseAction {
    protected ISysLog iSysLog = new ConsoleLog();
    protected TxtLog txtLog = new TxtLog();
}
