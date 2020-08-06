package com.tcy365.service.Impl;

import com.tcy365.common.bizEnum.IsVisible;
import com.tcy365.common.bizEnum.TKDType;
import com.tcy365.dao.tcy365webdb.tbl_TkdMapper;
import com.tcy365.entity.tcy365webdb.tbl_Tkd;
import com.tcy365.service.ITblTkdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TblTkdServiceImpl implements ITblTkdService {

    @Autowired
    private tbl_TkdMapper tkdMapper;

    @Override
    public tbl_Tkd getMobileWebTkd(String webdomain) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("IsVisible", IsVisible.Visible.getCode());
        map.put("TKDType", TKDType.Mobile.getCode());
        map.put("webdomain", webdomain);
        tbl_Tkd tkd= tkdMapper.selectByCondition(map);
        return tkd;
    }
}
