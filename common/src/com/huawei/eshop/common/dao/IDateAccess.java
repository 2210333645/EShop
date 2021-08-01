package com.huawei.eshop.common.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * 访问数据文件，
 * 返回结果
 */
public interface IDateAccess {
      <T> List<T> getList(Class<T> clazz) throws  Exception;

      void writeloginlog(Class clazz,String log) throws URISyntaxException, IOException;


}
