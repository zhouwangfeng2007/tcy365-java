package com.tcy365.externalService.Helper;

import lombok.var;
import org.junit.Test;

import static org.junit.Assert.*;

public class IPASHelperTest {

    @Test
    public void Test1() throws Exception {
        var a = IPASHelper.getAllProvince();
        System.out.println(a);
    }
}