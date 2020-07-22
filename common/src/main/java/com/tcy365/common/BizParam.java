package com.tcy365.common;

import com.tcy365.common.utils.ConfigHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BizParam {

    private String webResourceUrl;

    /**
     * 获取配置值
     * @return
     */
    public static String getWebResourceUrl() {
        return ConfigHelper.getValue("biz.value.webresourceurl");
    }

    private String mainWebUrl;

}
