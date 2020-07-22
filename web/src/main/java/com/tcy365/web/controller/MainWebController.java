package com.tcy365.web.controller;


import com.tcy365.entity.tcy365webdb.tbl_Web;
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
public class MainWebController {

    @Autowired
    private ITblWebService ITblWebService;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String MainWeb(HttpServletRequest request, Model model) {

        return "mainweb.jsp";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String RootUrl(HttpServletResponse response) {

        return "selectcity.jsp";
    }
}
