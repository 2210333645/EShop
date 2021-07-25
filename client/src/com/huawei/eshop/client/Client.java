package com.huawei.eshop.client;

/**
 * 所有客户端的公共父类
 * 处理公共的用户操作
 */
public class Client {
    /** 全局操作 登录*/
    public static final String LOGIN = "L";
    /** 全局操作 上一页面*/
    public static final String HISTORY = "I";
    /** 全局操作 首页*/
    public static final String INDEX = "I";

    public static void main(String[] args) {
        Client client = new Client();
        client.start();

    }
    public void start(){
        UserClient userClient = new UserClient();
        String result =  userClient.ShowLogin();
        if (result.equals(INDEX)){
            System.out.println("这里是首页");
        }else if (result.equals(HISTORY)){
            System.out.println("这里是历史页面");
        }else if (result.equals(LOGIN)){
            System.out.println("登录界面");
        }else {
            System.out.println("出错了");
        }

    }

}
