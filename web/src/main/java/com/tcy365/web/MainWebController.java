package com.tcy365.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;


@Controller
public class MainWebController {
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String mainWeb(HttpServletRequest request) {
        String uri= request.getRequestURI();

        return "mainweb.jsp";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String RootUrl(HttpServletResponse response) {
       Collection<String> headers = response.getHeaderNames();
        return "fzweb.jsp";
    }
}
