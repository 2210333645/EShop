package com.huawei.eshop.user;

import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;

/**
 * user控制类，所有的用户操作的控制类
 * 返回json字符串 msg类
 */
public class UserAction {

    private String username ;
    private String password ;

    /**
     * 用户等路功能
     * @return
     */
    public String login (){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        Msg msg =new Msg();
        msg.setType(Msg.SUCCESS);
        msg.setMsg("登录成功");
        return JsonUtil.entity2json(msg);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return password;
    }

    public void setPasswd(String password) {
        this.password = password;
    }
}
