package com.huawei.eshop.client;

import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;
import com.huawei.eshop.goods.action.GoodsAction;
import com.huawei.eshop.goods.entity.Goods;

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

    public void showGoodlist() throws Exception {
    //1.向后台发送请求,获取商品数据
        GoodsAction goodsAction = new GoodsAction();
        String goodlist = goodsAction.getGoodlist();
        Msg msg = JsonUtil.Json2Entity(goodlist, Msg.class);
        String s = msg.getObj().toString();
        List<Goods> goods = JsonUtil.JSONArrary2Entity(s, Goods.class);
        System.out.println("商品列表");
        System.out.println("编号"+"\t商品名称"+"\t\t单价"+"\t库存");
        System.out.println("-----------------------------------");

        for (int i= 1 ;i<goods.size();i++){
            for (Goods goods1:
                 goods) {
                System.out.println(i+"\t"+goods1.getName()+"\t\t"+goods1.getPrice()+"\t"+goods1.getNub());
            }

        }







    }
    public void showGoodsDetail(){


    }

}
