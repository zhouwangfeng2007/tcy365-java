package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365webdb.tbl_GameDetailPage;

public interface tbl_GameDetailPageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_GameDetailPage record);

    int insertSelective(tbl_GameDetailPage record);

    tbl_GameDetailPage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tbl_GameDetailPage record);

    int updateByPrimaryKeyWithBLOBs(tbl_GameDetailPage record);

    int updateByPrimaryKey(tbl_GameDetailPage record);
}