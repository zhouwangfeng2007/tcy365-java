package com.tcy365.common.utils;

public class StringHelper {

    /**
     * 去除首尾指定字符
     *
     * @param str     字符串
     * @param element 指定字符
     * @return
     */
    public static String trim(String str, String element) {
        if (str == null || str.equals("")) return str;
        if (str.equals(element)) return "";
        boolean beginIndexFlag = true;
        boolean endIndexFlag = true;
        do {
            int beginIndex = str.indexOf(element) == 0 ? 1 : 0;
            int endIndex = str.lastIndexOf(element) + 1 == str.length() ? str.lastIndexOf(element) : str.length();
            str = str.substring(beginIndex, endIndex);
            beginIndexFlag = (str.indexOf(element) == 0);
            endIndexFlag = (str.lastIndexOf(element) + 1 == str.length());
        } while (beginIndexFlag || endIndexFlag);
        return str;
    }

    /**
     * 判断字符串是否为空
     *
     * @param src
     * @return
     */
    public static Boolean isNullOrEmpty(String src) {
        if (src == null) {
            return true;
        }
        if ("".equals(src)) {
            return true;
        }
        if ("".equals(src.trim())) {
            return true;
        }
        return false;
    }

}
