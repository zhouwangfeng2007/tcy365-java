package com.tcy365.adm.controller;


import com.tcy365.entity.tcy365webdb.tbl_Tkd;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblTkdService;
import com.tcy365.service.ITblWebService;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/WebSite")
public class EditWebSiteController {

    @Autowired
    private ITblWebService tblWebService;

    @Autowired
    private ITblTkdService tbltkdService;

    @RequestMapping(value = {"/EditWebSite"})
    public String EditWebSite(@RequestParam(value = "wid", required = false) Integer id, HttpServletRequest request, Model model) {
        model.addAttribute("id", id);
        tbl_Web web = tblWebService.getWebById(id);
        web.indexstatjs= StringEscapeUtils.escapeHtml(web.indexstatjs);
        web.friendlinks= StringEscapeUtils.escapeHtml(web.friendlinks);
         model.addAttribute("web", web);
        //request.setAttribute("web",web);
        String mobileWebdomain=String.format("%s",web.webdomain.replace("/",""));
        tbl_Tkd mobileTkd=tbltkdService.getMobileWebTkd(mobileWebdomain);
        model.addAttribute("mobileTkd",mobileTkd);
        return "EditWebSite.jsp";
    }
}
