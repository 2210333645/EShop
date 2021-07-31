package com.huawei.eshop.dao;

import com.huawei.eshop.common.dao.BaseDAO;
import com.huawei.eshop.entity.User;

import java.util.List;

public interface UserDao extends BaseDAO {


    List<User> getEntityList() throws Exception ;

}
