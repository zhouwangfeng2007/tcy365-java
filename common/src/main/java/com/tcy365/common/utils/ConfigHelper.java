package com.tcy365.common.utils;

import com.tcy365.common.BizParam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigHelper {
    private static Properties getProperties() throws IOException {
        Properties p = new Properties();
        InputStream in = BizParam.class.getClassLoader().getResourceAsStream("bizConfig.properties");
        p.load(in);
        return p;
    }

    public static String getValue(String key) {
        try {
            Properties prop = getProperties();
            String value = prop.getProperty(key);
            return value;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
