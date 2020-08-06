package com.tcy365.adm.controller;

import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/News")
public class WebNewsListController {

    @Autowired
    private ITblWebService webService;

    @RequestMapping(value = "/WebNewsList", method = RequestMethod.GET)
    public String WebNewsList(@RequestParam(required = false, defaultValue = "1") Integer from,
                              @RequestParam(name = "wid") Integer wid, Model model) {
        tbl_Web web = webService.getWebById(wid);
        model.addAttribute("web", web);
        return "News/WebNewsList.jsp";
    }
}
