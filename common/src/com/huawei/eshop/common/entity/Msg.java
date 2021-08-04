package com.huawei.eshop.common.entity;

/**
 * 消息封装类
 */
public class Msg {

    //消息类型 ：成功
    public static final String SUCCESS = "SUCCESS";
    //消息类型 ：失败

    public static final String FAIL = "FAIL";

    //消息 类型
    private String type ;
    //消息内容
    private String msg ;

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
