package com.tcy365.web;

import com.tcy365.service.WebInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tcy365webdb.tblWeb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;


@Controller
public class MainWebController {

    @Autowired
    private WebInfoService webInfoService;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String mainWeb(HttpServletRequest request, Model model) {
        String uri = request.getRequestURI();
        tblWeb webIndexMain = webInfoService.getWebById(1);
        List<tblWeb> allWeb = webInfoService.getAll();
        model.addAttribute("allWeb", allWeb);
        return "mainweb.jsp";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String RootUrl(HttpServletResponse response) {
        Collection<String> headers = response.getHeaderNames();
        return "fzweb.jsp";
    }
}
