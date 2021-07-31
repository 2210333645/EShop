package com.huawei.eshop.common.dao;

import java.util.List;

/**
 * 访问数据文件，
 * 返回结果
 */
public interface IDateAccess {
      <T> List<T> getList(Class<T> clazz) throws  Exception;
}
