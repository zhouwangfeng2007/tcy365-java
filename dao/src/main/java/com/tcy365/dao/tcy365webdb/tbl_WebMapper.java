package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365web.tbl_Web;
import org.apache.ibatis.annotations.Mapper;


public interface tbl_WebMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_Web record);

    int insertSelective(tbl_Web record);

    tbl_Web selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tbl_Web record);

    int updateByPrimaryKeyWithBLOBs(tbl_Web record);

    int updateByPrimaryKey(tbl_Web record);
}