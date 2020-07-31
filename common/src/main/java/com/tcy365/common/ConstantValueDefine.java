package com.tcy365.common;

/**
 * 常量定义
 */
public class ConstantValueDefine {
    /**
     * 主站信息在数据库中的表Id
     */
    public static final Integer MainWebDbTableId = 1;

    /**
     * 当前分站的Cookie名称
     */
    public static final String CurrentWebDomain_CookieName = "webdomain";

    /**
     * 分站Cookies过期时间
     */
    public static final Integer CurrentWebDomain_CookieAge = 86400 * 7;

    /**
     * 10分钟用毫秒表示的
     */
    public static  long TenMinitWithMs=1000*10*60;
}
