package com.huawei.eshop.log.dao;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ISysLog {
    public static final String INFO = "info";

    public static final String WARN = "WARN";

    public static final String ERROR = "ERROR";

    void info(String msg) throws URISyntaxException, IOException;
    void warn(String msg) throws URISyntaxException, IOException;
    void error(String msg);


}
