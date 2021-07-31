package com.huawei.eshop.common.util;

import com.alibaba.fastjson.JSON;
import com.huawei.eshop.common.entity.Entity;
import com.huawei.eshop.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Json工具类封装
 */
public class JsonUtil {

    public static void main(String[] args) {

        Entity entity = new Entity();
        entity.setId("100");
        entity.setCreateTime("22:16");
        String s = JsonUtil.entity2json(entity);
        System.out.println(s);//{"createTime":"22:16","id":"100","idDel":"1"}

        System.out.println("---------------");
        List<Entity> entityList = new ArrayList<>();
        entityList.add(entity);
        String entityListJson = JsonUtil.entityListJson(entityList);
        System.out.println(entityListJson);//[{"createTime":"22:16","id":"100","idDel":"1"}]

        System.out.println("---------------");
        Entity entity1 = JsonUtil.Json2Entity("{\"createTime\":\"22:16\",\"id\":\"100\",\"idDel\":\"1\"}", Entity.class);
        System.out.println(entity1.getCreateTime());

        System.out.println("---------------");
        List<Entity> entityList1 = JsonUtil.JSONArrary2Entity("[{\"createTime\":\"22:16\",\"id\":\"100\",\"idDel\":\"1\"},{\"createTime\":\"22:18\",\"id\":\"110\",\"idDel\":\"1\"}]", Entity.class);
        System.out.println(entityList1.get(1).getCreateTime());

        User user = new User();
        user.setUsername("admin");
        user.setPassword("1234");
        User user1 = new User();
        user1.setUsername("play1");
        user1.setPassword("1234");


        List<Entity> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        System.out.println(JsonUtil.entityListJson(userList));
    }

    /**
     * 将对象转化为json格式
     * @param entity
     * @return 返回json格式字符串
     */
    public static String entity2json(Object entity){

        return JSON.toJSONString(entity);
    }

    /**
     * 将实体对象列表转化为Json字符串
     * @param entities
     * @return
     */
    public static String entityListJson(List<Entity> entities){
        return entity2json(entities);
    }

//    /**
//     * 将Json字符串转换为class对象
//     * ？为泛型通配符
//     * @param json
//     * @param clazz
//     * @return
//     */
//    public static Object Json2Entity(String json , Class<?> clazz){
//        return JSON.parseObject(json,clazz);
//    }

    /**
     * 将Json字符串转换为class对象
     * ？为泛型通配符,OBJECT对象
     * <T>定义泛型
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T Json2Entity(String json , Class<T> clazz){
        return JSON.parseObject(json,clazz);
    }

    /**
     * 将string 数组转换成
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> JSONArrary2Entity(String json,Class<T> clazz){
        return JSON.parseArray(json,clazz);
    }
}
