package com.tcy365.common.utils;

import java.util.List;

public class ListHelper {
    public static boolean IsEmpty(List<?> listSrc){
        if(listSrc.isEmpty()){
            return true;
        }
        if(listSrc==null){
            return true;
        }
        if(listSrc.size()<=0){
            return true;
        }
        return false;
    }
}
