package com.huawei.eshop.log.entity;

public class log {
    public String level;
    public String msg;
    public String time;

    public log() {

    }

    public log(String level, String msg, String time) {

        this.level = level;
        this.msg=msg;
        this.time=time;

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return
                "level=" + level  +
                ", msg=" + msg  +
                ", time=" + time
                ;
    }
}
