package com.tcy365.adm.controller;


import com.tcy365.common.SelfCheckResultItem;
import com.tcy365.dao.tcy365webdb.ITblWebDao;
import com.tcy365.dao.tcy365webdb.tbl_WebMapper;
import com.tcy365.entity.tcy365web.tbl_Web;
import com.tcy365.service.ITblWebService;
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

//    @Autowired
//    private ITblWebService tblWebServiceImpl;

    @Autowired
    private tbl_WebMapper tbl_webMapper;


    @RequestMapping(value = "/checkall", method = RequestMethod.GET)
    @ResponseBody
    public List<SelfCheckResultItem> checkAll() {
        List<SelfCheckResultItem> listResult = new ArrayList<>();
        listResult.add(getCurrentSysTime());


        listResult.add(checkDb());
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

    private SelfCheckResultItem checkDb() {
        SelfCheckResultItem item = new SelfCheckResultItem();
        item.setCheckItem("检测数据库");
        tbl_Web web = tbl_webMapper.selectByPrimaryKey(1);
        item.setCheckResult(web.getTitle() + "成功" );
        return item;
    }
}
