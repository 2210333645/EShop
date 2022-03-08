package com.huawei.eshop.goods.dao.impl;

import com.huawei.eshop.common.dao.impl.BaseDAOImpl;
import com.huawei.eshop.goods.dao.GoodsDao;
import com.huawei.eshop.goods.entity.Goods;

import java.util.List;

public class GoodsDaoImpl extends BaseDAOImpl implements GoodsDao {
    @Override
    public List<Goods> GOODS_LIST() throws Exception {

        return dateAccess.getList(Goods.class);
    }
}
