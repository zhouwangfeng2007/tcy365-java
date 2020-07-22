package com.tcy365.common;

import com.tcy365.common.utils.ConfigHelper;
import com.tcy365.common.utils.ListHelper;
import com.tcy365.common.utils.StringHelper;
import com.tcy365.entity.tcy365webdb.tbl_Web;

import java.util.Arrays;
import java.util.List;

public class BizShowSelCity {

    public static Boolean ShowSelCity(tbl_Web web) {

        if (web == null) {
            return false;
        }
        String str = ConfigHelper.getValue("biz.value.NoOtherCityLink");
        if (StringHelper.isNullOrEmpty(str)) {
            return false;
        }
        List<String> lstNoSelCity = Arrays.asList(str.split(","));
        if (ListHelper.IsEmpty(lstNoSelCity)) {
            return false;
        }

        if (lstNoSelCity.lastIndexOf(web.getWebarea())>=0)
        {
            return false;
        }

        return true;
    }
}
