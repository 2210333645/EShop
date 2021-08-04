package com.huawei.eshop.client;

import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;
import com.huawei.eshop.goods.action.GoodsAction;

import java.util.List;

/**
 *
 * ×展示商品列表
 * *1.向后台发送请求,获取商品数据
 * *2.解析响应消息字符串
 * *3.展示商品列表
 *
 */

public class GoodsClient extends Client{

    public void showGoodlist(){
    //1.向后台发送请求,获取商品数据
        GoodsAction goodsAction = new GoodsAction();
        String goodlist = goodsAction.getGoodlist();
        List<Msg> msgs = JsonUtil.JSONArrary2Entity(goodlist, Msg.class);

    }
    public void showGoodsDetail(){


    }

}
