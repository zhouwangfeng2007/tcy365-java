package com.tcy365.web.controller;

import com.tcy365.entity.tcy365webdb.tbl_Web;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    public tbl_Web getCurrentWeb(HttpServletRequest request) {
        tbl_Web web = (tbl_Web) request.getAttribute("web");
        return web;
    }
}
