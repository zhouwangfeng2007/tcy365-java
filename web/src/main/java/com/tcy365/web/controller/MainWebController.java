package com.tcy365.web.controller;


import com.tcy365.common.BizParam;
import com.tcy365.entity.tcy365webdb.tbl_PCBanner;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.IPcBannerService;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;

@Controller
public class MainWebController extends BaseController {

    @Autowired
    private IPcBannerService pcBannerService;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String MainWeb(HttpServletRequest request, Model model) {
        tbl_Web web = getCurrentWeb(request);
        request.setAttribute("MetaMobileUrl", BizParam.getMobileWebUrl());
        request.setAttribute("SelIndex", 1);
        List<tbl_PCBanner> listPcBanner = pcBannerService.selectByWebId(web.getId());
        request.setAttribute("ListPcBanner", listPcBanner);
        return "mainweb.jsp";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String RootUrl(HttpServletResponse response, Model model) {

        return "selectcity.jsp";
    }
}
