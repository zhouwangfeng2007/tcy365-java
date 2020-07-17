package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365webdb.tbl_Web;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ITblWebDao   {

    @Select("select * from tbl_Web where Id=#{id}")
    public tbl_Web getWebById(long id);

    @Select("select * from tbl_Web")
    public List<tbl_Web> getAll();
}
