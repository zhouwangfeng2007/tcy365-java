package com.tcy365.adm.controller;


import com.tcy365.common.SelfCheckResultItem;
import com.tcy365.entity.tcy365web.tblWeb;
import com.tcy365.service.WebInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/selfcheck")
public class SelfCheckController {

    @Autowired
    private WebInfoService webInfoService;

    @RequestMapping(value = "/checkall", method = RequestMethod.GET)
    @ResponseBody
    public List<SelfCheckResultItem> checkAll() {
        List<SelfCheckResultItem> listResult = new ArrayList<>();
        listResult.add(getCurrentSysTime());

        tblWeb web=webInfoService.getWebById(1);
        return listResult;
    }

    private SelfCheckResultItem getCurrentSysTime() {
        SelfCheckResultItem item = new SelfCheckResultItem();
        item.setCheckItem("当前系统时间");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间
        item.setCheckResult(date);
        return item;
    }
}
