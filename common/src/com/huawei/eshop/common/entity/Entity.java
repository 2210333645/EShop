package com.huawei.eshop.common.entity;
/*实体类
* 所有实体类的父类
* 封装数据
* */
public class Entity {
    /*数据唯一标识*/
    private String id ;
    /*创建时间*/
    private String createTime;
    /*删除时间*/
    private String deleteTime;
    /*删除状态，1，正常，0.已删除*/
    private  String idDel="1";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getIdDel() {
        return idDel;
    }

    public void setIdDel(String idDel) {
        this.idDel = idDel;
    }
}
