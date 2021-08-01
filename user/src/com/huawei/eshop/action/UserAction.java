package com.huawei.eshop.action;

import com.huawei.eshop.common.action.BaseAction;
import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;
import com.huawei.eshop.entity.User;
import com.huawei.eshop.servise.UserServise;
import com.huawei.eshop.servise.impl.Userserviseimpl;

/**
 * user控制类，所有的用户操作的控制类
 * 返回json字符串 msg类
 */
public class UserAction extends BaseAction {

    private String username ;
    private String password ;

    /**
     * 用户等路功能
     * /**
     * *用户登录功能
     * *1.封装数据到user对象
     * ★2.调用Userservice处理逻辑
     * *User login (user user) throws Exception ;
     * * 3.异常处理
     * *4 .根据服务层返回结果生成消息*消息.实体类Msg
     * * 5.记录日志(待开发)
     * *6.响应消息到客户端* @return
     * @return
     */
    public String login () {
        Msg msg = new Msg();
        try {


            //* *1.封装数据到user对象
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

//             * ★2.调用Userservice处理逻辑
//                * *User login (user user) throws Exception ;

            UserServise userServise = new Userserviseimpl();
            user=userServise.login(user);

            if (user != null){
                msg.setType(Msg.SUCCESS);
                msg.setMsg("登录成功");
//                iSysLog.info(username+"用户登录成功");


                txtLog.info(username+"用户登录成功");

            }else{
                msg.setType(Msg.FAIL);
                msg.setMsg("用户名或密码不正确");
                txtLog.warn(username+"用户名或密码不正确");
            }
            return JsonUtil.entity2json(msg);

//            4 .根据服务层返回结果生成消息*消息.实体类Msg


        } catch (Exception e) {

            e.printStackTrace();
            msg.setType(Msg.FAIL);
            msg.setMsg("服务器错误");
            return JsonUtil.entity2json(msg);
        }
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
