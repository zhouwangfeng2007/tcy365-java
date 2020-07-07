package com.tcy365.mapper;

import org.apache.ibatis.annotations.Select;
import tcy365webdb.tblWeb;

public interface tblWebMapper {

    @Select("select * from tbl_web where Id=#{id}")
    tblWeb GetWebById(long id);
}
