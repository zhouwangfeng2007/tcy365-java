package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365webdb.tbl_Tkd;

import java.util.HashMap;

public interface tbl_TkdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_Tkd record);

    int insertSelective(tbl_Tkd record);

    tbl_Tkd selectByPrimaryKey(Integer id);

    tbl_Tkd selectByCondition(HashMap<String, Object> condition);

    int updateByPrimaryKeySelective(tbl_Tkd record);

    int updateByPrimaryKey(tbl_Tkd record);
}