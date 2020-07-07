package com.tcy365web.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tcy365webdb.tblWeb;

import java.util.List;

@Repository
public interface tblWebDao {

    @Select("select * from tbl_Web where Id=#{id}")
    public tblWeb getWebById(long id);

    @Select("select * from tbl_Web")
    public List<tblWeb> getAll();
}
