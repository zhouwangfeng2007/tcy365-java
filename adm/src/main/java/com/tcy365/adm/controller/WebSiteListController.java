package com.tcy365.adm.controller;

import com.github.pagehelper.PageInfo;
import com.tcy365.entity.dto.QueryWebInput;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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
        String pageUrlPrefix = getPageProfix(request);
        model.addAttribute("pageUrlPrefix", pageUrlPrefix);
        model.addAttribute("input",queryWebInput);
        PageInfo<tbl_Web> listWeb = tblWebService.selectByPage(pageIndex, pageSize, null);
        request.setAttribute("pageInfo", listWeb);
        return "WebSiteList.jsp";
    }

    String getPageProfix(HttpServletRequest request) {
        String pageUrlPrefix = "";
        String uri = request.getRequestURI() + "";
        Map<String, String[]> parameterMap = request.getParameterMap();
        if (parameterMap == null || parameterMap.size() <= 0) {
            pageUrlPrefix = "?pageIndex";
            return uri + pageUrlPrefix;
        }
        if (parameterMap.size() == 1) {
            pageUrlPrefix = "?pageIndex";
            return uri + pageUrlPrefix;
        }

        for (String pName : parameterMap.keySet()) {
            if (pName.equals("pageIndex")||pName.equals("t")) {
                continue;
            } else {
                pageUrlPrefix += "&" + pName + "=" + parameterMap.get(pName)[0];
            }
        }
        return uri +"?t=1"+pageUrlPrefix+"&pageIndex";
    }



}
