package com.huawei.eshop.goods.service.impl;

import com.huawei.eshop.goods.dao.GoodsDao;
import com.huawei.eshop.goods.dao.impl.GoodsDaoImpl;
import com.huawei.eshop.goods.entity.Goods;
import com.huawei.eshop.goods.service.GoodsService;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {

    GoodsDao goodsDao = new GoodsDaoImpl();
    @Override
    public List<Goods> getDoodsList() throws Exception {

        return goodsDao.GOODS_LIST();

    }

    @Override
    public Goods getGoodsDetail() {
        return null;
    }
}
