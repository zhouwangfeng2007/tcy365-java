package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365webdb.tbl_Web;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface tbl_WebMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_Web record);

    int insertSelective(tbl_Web record);

    tbl_Web selectByPrimaryKey(Integer id);

    tbl_Web selectByDomain(String webDomain);

    List<tbl_Web> selectAll();

    public List<tbl_Web> selectByPage(  HashMap<String, Object> condition);

    int updateByPrimaryKeySelective(tbl_Web record);

    int updateByPrimaryKeyWithBLOBs(tbl_Web record);

    int updateByPrimaryKey(tbl_Web record);

    int updateVisible(@Param("isvisible") Integer isvisible ,@Param("id") Integer id);
}