package com.tcy365.service.Impl;

import com.tcy365.cache.ehcache.CacheFactory;
import com.tcy365.common.ConstantValueDefine;
import com.tcy365.common.utils.ListHelper;
import com.tcy365.entity.dto.AreaInfo;
import com.tcy365.externalService.Helper.IPASHelper;
import com.tcy365.service.IIpAreaCacheService;
import net.sf.ehcache.Element;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class IpAreaCacheServiceImpl implements IIpAreaCacheService {
    @Override
    public List<AreaInfo> getAllProvince() throws Exception {
        String key = "allProvince";
        return getAreaInfos(key, IPASHelper.getAllProvince());
    }

    private List<AreaInfo> getAreaInfos(String key, List<AreaInfo> allProvince) throws Exception {
        Element ele = CacheFactory.EhCache().get(key);
        if (ele != null) {
            return (List<AreaInfo>) ele.getObjectValue();
        }
        List<AreaInfo> result  = allProvince;
        CacheFactory.EhCache().set(key, result, ConstantValueDefine.TenMinitWithMs);
        return result;
    }

    @Override
    public List<AreaInfo> getCityByProvinceID(String provinceId) throws Exception {
        String key = "allCity"+provinceId;
        return getAreaInfos(key, IPASHelper.getCityByProvinceID(provinceId));

    }

    @Override
    public List<AreaInfo> getDistrictByCityID(String cityId) throws Exception {
        String key = "allCity"+cityId;
        return getAreaInfos(key, IPASHelper.getDistrictByCityID(cityId));
    }
}
