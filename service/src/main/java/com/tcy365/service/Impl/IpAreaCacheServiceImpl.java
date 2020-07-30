package com.tcy365.service.Impl;

import com.tcy365.entity.dto.AreaInfo;
import com.tcy365.externalService.Helper.IPASHelper;
import com.tcy365.service.IIpAreaCacheService;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class IpAreaCacheServiceImpl implements IIpAreaCacheService {
    @Override
    public List<AreaInfo> getAllProvince() throws Exception {
        return IPASHelper.getAllProvince();
    }

    @Override
    public List<AreaInfo> getCityByProvinceID(String provinceId) throws Exception {
        return IPASHelper.getCityByProvinceID(provinceId);
    }

    @Override
    public List<AreaInfo> getDistrictByCityID(String cityId) throws Exception {
        return IPASHelper.getDistrictByCityID(cityId);
    }
}
