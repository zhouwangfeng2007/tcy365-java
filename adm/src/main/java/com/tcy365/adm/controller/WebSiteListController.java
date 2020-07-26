package com.tcy365.adm.controller;

import com.github.pagehelper.PageInfo;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/WebSite")
public class WebSiteListController {

    @Autowired
    private ITblWebService tblWebService;

    @RequestMapping(value = "/WebSiteList", method = RequestMethod.GET)
    public String WebSiteList(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                              @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                              HttpServletRequest request, HttpServletResponse response ) {
        List<tbl_Web> listWeb = tblWebService.selectByPage(pageIndex, pageSize);
        request.setAttribute("pagedWeb", listWeb);

//        PageInfo<tbl_Web> listWeb =  tblWebService.selectByPage(pageIndex, pageSize);
//        request.addAttribute("pageInfo", listWeb);

//        PageInfo<Article> articleList = articleService.pageArticle(pageIndex, pageSize, criteria);
//        model.addAttribute("pageInfo", articleList);
        return "WebSiteList.jsp";
    }
}
