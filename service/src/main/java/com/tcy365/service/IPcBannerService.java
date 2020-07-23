package com.tcy365.service;

import com.tcy365.entity.tcy365webdb.tbl_PCBanner;

import java.util.List;

public interface IPcBannerService {
    public List<tbl_PCBanner> selectByWebId(Integer tblWebId);
}
