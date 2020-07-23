package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365webdb.tbl_PCBanner;

import java.util.List;

public interface tbl_PCBannerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_PCBanner record);

    int insertSelective(tbl_PCBanner record);

    tbl_PCBanner selectByPrimaryKey(Integer id);

    List<tbl_PCBanner> selectByWebId(Integer tblWebId);

    int updateByPrimaryKeySelective(tbl_PCBanner record);

    int updateByPrimaryKey(tbl_PCBanner record);
}