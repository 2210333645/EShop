package com.huawei.eshop.servise.impl;

import com.huawei.eshop.dao.UserDao;
import com.huawei.eshop.dao.impl.UserDaoImpl;
import com.huawei.eshop.entity.User;
import com.huawei.eshop.servise.UserServise;

import java.util.List;

public class Userserviseimpl implements UserServise {
    UserDao userDao;
    /**

     * *用户登录,根据用户名、密码获取用户对象
     * 1.调用UserDAo获取用户列表数据
     *  List<User> getEntityList() throws Exception ;
     * 2.遍历用户列表,逐个与给定用户对象的用户名、密码进行匹配*
     * 3.匹配成功则返回该用户对象,失败返回null
     * @paran user封装了用户名、密码的实体对象
     * @return返回User对象,或者当用户名/密码错误时返回null*@throws Exception
     *
     */
    @Override
    public User login(User user) throws Exception {
        // * 1.调用UserDAo获取用户列表数据

        userDao = new UserDaoImpl();
        List<User>  userList=   userDao.getEntityList();

        if(userList != null){
            for (User u:userList) {
                if (u.getUsername().equals(user.getUsername())
                        && u.getPassword().equals(user.getPassword())){
                    return u;
                }
            }
        }

        return null;
    }
}
