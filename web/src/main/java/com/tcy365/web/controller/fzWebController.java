package com.tcy365.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class fzWebController {

    @RequestMapping(value={"/{domain}/","/{domain}"},method = RequestMethod.GET)
    public String fzWeb(@PathVariable("domain") String domain, Model model) {

        model.addAttribute("domain", domain);
        return "fzweb.jsp";
    }
}
