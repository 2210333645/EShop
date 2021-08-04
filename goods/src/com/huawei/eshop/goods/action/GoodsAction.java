package com.huawei.eshop.goods.action;

import com.huawei.eshop.common.action.BaseAction;
import com.huawei.eshop.common.entity.Msg;
import com.huawei.eshop.common.util.JsonUtil;


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

    public String getGoodlist(){
        //获取商品列表
        Msg msg = new Msg();
        return JsonUtil.entity2json(msg);

    }

    public String getGoodsDetail(){

        return null;
    }

}
