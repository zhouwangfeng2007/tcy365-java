package com.tcy365.adm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/WebSite")
public class EditWebSiteController {

    @RequestMapping(value = {"/EditWebSite"})
    public String EditWebSite(@RequestParam(value = "id", required = false) Integer id, Model model) {
        model.addAttribute("id", id);

        return "EditWebSite.jsp";
    }
}
