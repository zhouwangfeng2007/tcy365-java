package com.tcy365.adm.webapi;

import com.tcy365.common.Tcy365Result;
import com.tcy365.entity.dto.AreaInfo;
import com.tcy365.externalService.Helper.IPASHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/area")
public class AreaController {

    @RequestMapping(value = "/getallprovince", method = RequestMethod.GET)
    @ResponseBody
    public Tcy365Result<List<AreaInfo>> GetAllProvince() throws Exception {
        List<AreaInfo> result = IPASHelper.getAllProvince();
        return Tcy365Result.Success(result);
    }

    @RequestMapping("/getcity/{provinceId}")
    @ResponseBody
    public Tcy365Result<List<AreaInfo>> GetCity(@PathVariable String provinceId) throws Exception {
        List<AreaInfo> result = IPASHelper.getCityByProvinceID(provinceId);
        return Tcy365Result.Success(result);
    }

    @RequestMapping("/getdistrict/{cityId}")
    @ResponseBody
    public Tcy365Result<List<AreaInfo>> GetDistrict(@PathVariable String cityId) throws Exception {
        List<AreaInfo> result = IPASHelper.getDistrictByCityID(cityId);
        return Tcy365Result.Success(result);
    }
}
