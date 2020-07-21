package com.tcy365.web.controller.interceptor;

import com.tcy365.common.ConstantValueDefine;
import com.tcy365.common.utils.StringHelper;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WebCommonInterceptor implements HandlerInterceptor {

    @Autowired
    ITblWebService webService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String uri = httpServletRequest.getRequestURI();
        StringBuffer url = httpServletRequest.getRequestURL();

        System.out.println("preHandle,uri=" + uri + ",url=" + url);
        tbl_Web web;
        if ("index.html".equals(uri)) {
            //主站
            web = webService.getWebById(ConstantValueDefine.MainWebDbTableId);
        } else {
            String domain = StringHelper.trim(uri, "/");
            web = webService.getWebByDomain(domain);
        }

        httpServletRequest.setAttribute("web", web);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }
}
