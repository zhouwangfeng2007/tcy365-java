package com.tcy365.common;

import java.util.List;

public class Utils {
    public static boolean IsEmpty(List<?> listSrc){
        if(listSrc==null){
            return true;
        }
        if(listSrc.size()<=0){
            return true;
        }
        return false;
    }
}
