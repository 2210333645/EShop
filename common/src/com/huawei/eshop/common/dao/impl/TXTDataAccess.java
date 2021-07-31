package com.huawei.eshop.common.dao.impl;

import com.huawei.eshop.common.dao.IDateAccess;
import com.huawei.eshop.common.util.FileUtil;
import com.huawei.eshop.common.util.JsonUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class TXTDataAccess implements IDateAccess {
    @Override
    public <T> List<T> getList(Class<T> clazz) throws IOException, URISyntaxException {

        String userName = clazz.getSimpleName().toLowerCase();
        String dataFileName = "db_"+userName+".txt";

        String dataFilename = "db/"+dataFileName;

        String s = FileUtil.readBybuffered(dataFilename);

        return JsonUtil.JSONArrary2Entity(s, clazz);

    }
}
