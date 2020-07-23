package com.tcy365.service.Impl;

import com.tcy365.dao.tcy365webdb.tbl_PCBannerMapper;
import com.tcy365.entity.tcy365webdb.tbl_PCBanner;
import com.tcy365.service.IPcBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcBannerServiceImpl implements IPcBannerService {

    @Autowired
    private tbl_PCBannerMapper tbl_PCBannerMapper;

    @Override
    public List<tbl_PCBanner> selectByWebId(Integer tblWebId) {
        return tbl_PCBannerMapper.selectByWebId(tblWebId);
    }
}
