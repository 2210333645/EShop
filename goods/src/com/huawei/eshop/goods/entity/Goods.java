package com.huawei.eshop.goods.entity;

import com.huawei.eshop.common.entity.Entity;

public class Goods  extends Entity {

    private String name;
    private String price;
    private String nub;
    private String brand;

    public Goods(String name, String price, String nub, String brand) {
        this.name = name;
        this.price = price;
        this.nub = nub;
        this.brand = brand;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNub() {
        return nub;
    }

    public void setNub(String nub) {
        this.nub = nub;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
