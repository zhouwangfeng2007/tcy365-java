package com.tcy365.adm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tcy365.common.utils.StringHelper;
import com.tcy365.entity.dto.QueryWebInput;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import lombok.var;
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

    @RequestMapping(value = "/WebSiteList")
    public String WebSiteList(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                              @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                              QueryWebInput queryWebInput,
                              HttpServletRequest request, HttpServletResponse response, Model model) {
        System.out.println(queryWebInput.toString());
        String queryString=request.getQueryString();
        if(StringHelper.isNullOrEmpty(queryString))        {
            queryString="pageIndex";
        }
        String uri=request.getRequestURI();
        var pageUrlPrefix =String.format("%s",uri+"?"+queryString) ;
        model.addAttribute("pageUrlPrefix", pageUrlPrefix);
        PageInfo<tbl_Web> listWeb = tblWebService.selectByPage(pageIndex, pageSize, null);
        request.setAttribute("pageInfo", listWeb);
        return "WebSiteList.jsp";
    }
}
