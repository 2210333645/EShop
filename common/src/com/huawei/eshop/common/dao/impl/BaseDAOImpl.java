package com.huawei.eshop.common.dao.impl;

import com.huawei.eshop.common.dao.BaseDAO;
import com.huawei.eshop.common.dao.IDateAccess;

public class BaseDAOImpl implements BaseDAO {
    protected IDateAccess dateAccess = new TXTDataAccess();
}
