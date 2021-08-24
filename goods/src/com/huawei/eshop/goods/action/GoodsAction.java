package com.huawei.eshop.goods.action;

import com.huawei.eshop.common.action.BaseAction;
import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;
import com.huawei.eshop.goods.entity.Goods;
import com.huawei.eshop.goods.service.GoodsService;
import com.huawei.eshop.goods.service.impl.GoodsServiceImpl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;


/**
 * 需火
 *  获取商品列表
 * *1.获取所有商品的对象列表
 * *2.将商品对象列表转换成字符串并返回*3.异常处理
 * * 4 .记录日志
 * *5.响应消,息到客户端*@return
 *
 */

public class GoodsAction extends BaseAction {

    Goods goods;
    private GoodsService goodsService;
    public GoodsAction(){

        goodsService = new GoodsServiceImpl();

    }
    public String getGoodlist() throws URISyntaxException, IOException {
        //获取商品列表
        Msg msg = new Msg();

        List<Goods> doodsList = goodsService.getDoodsList();

        msg.setObj(doodsList);
        msg.setType(Msg.SUCCESS);
        txtLog.info("获取商品列表");
        return JsonUtil.entity2json(msg);

    }

    public String getGoodsDetail(){

        Msg msg = new Msg();


        return JsonUtil.entity2json(msg);
    }

}
