package com.huawei.eshop.client;
import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;
import  com.huawei.eshop.user.UserAction;
import java.util.Scanner;

public class UserClient  extends Client{

    /**
     *
     1用户登录操作页面
     1.1 使用控制台提示用户输入用户名、密码
     1.2 向服务器发送请求,并接收返回消息字符串
     使用setter方法把数据传递给Action
     调用Action的登录功能
     3. 解析消息字符串,提示用户信息
     4. 页面跳转,使用字符串常量作为跳转标记
     成功:返回上一次操作的页面
     失败:返回登录页面
     */

    public String ShowLogin(){
        //用户登录操作页面
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

//        1.2 向服务器发送请求,并接收返回消息字符串
//        使用setter方法把数据传递给Action

        UserAction userAction = new UserAction();
        userAction.setUsername(username);
        userAction.setPasswd(password);
        //                调用Action的登录功能
        String result = userAction.login();

//       3. 解析消息字符串,提示用户信息
        Msg msg = JsonUtil.Json2Entity(result, Msg.class);
        if(msg.getType().equals(Msg.SUCCESS)){
            System.out.println("登录成功");
            //        4. 页面跳转,使用字符串常量作为跳转标记
            //        成功:返回上一次操作的页面
            return HISTORY;
        }else  {
            System.out.println("登录失败");
            //        失败:返回登录页面
            return LOGIN;
        }


    }


}
