package com.tcy365.service;

import com.tcy365.entity.dto.AreaInfo;

import java.util.List;


public interface IIpAreaCacheService {
    List<AreaInfo> getAllProvince() throws Exception;

    List<AreaInfo> getCityByProvinceID(String provinceId) throws Exception;

    List<AreaInfo> getDistrictByCityID(String cityId) throws Exception;
}
