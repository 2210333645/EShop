package com.huawei.eshop.dao.impl;

import com.huawei.eshop.common.dao.impl.BaseDAOImpl;
import com.huawei.eshop.dao.UserDao;
import com.huawei.eshop.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDAOImpl implements UserDao {

    @Override
    public List<User> getEntityList() throws Exception {
        return  dateAccess.getList(User.class);

    }
}
