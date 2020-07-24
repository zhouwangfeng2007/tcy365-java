package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365webdb.tbl_PCGameSort;

import java.util.List;

public interface tbl_PCGameSortMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_PCGameSort record);

    int insertSelective(tbl_PCGameSort record);

    List<tbl_PCGameSort> GetPcGameSortBy(Integer tblWebId, Integer sortType);

    tbl_PCGameSort selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tbl_PCGameSort record);

    int updateByPrimaryKey(tbl_PCGameSort record);
}