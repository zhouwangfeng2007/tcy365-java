package com.tcy365.adm.webapi;

import com.tcy365.common.Tcy365Result;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/web")
public class WebController {

    @Autowired
    private ITblWebService tblWebService;

    @RequestMapping(value = "/changevisible", method = RequestMethod.POST)
    @ResponseBody
    public Tcy365Result<String> ChangeVisible(@RequestParam("id") Integer id, @RequestParam("isvisible") Integer isvisible) {
        String info = String.format("修改站点的可见隐藏。Id=%s,isVisble=%s", id, isvisible);
        Boolean result = tblWebService.changeVisible(isvisible, id);
        if (result) {
            return Tcy365Result.Success(info + "修改成功。");
        }
        return Tcy365Result.Success(info + "修改失败。");
    }
}
