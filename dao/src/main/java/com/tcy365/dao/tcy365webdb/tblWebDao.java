package com.tcy365.dao.tcy365webdb;


import com.tcy365.entity.tcy365web.tblWeb;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface tblWebDao {

    @Select("select * from tbl_Web where Id=#{id}")
    public tblWeb getWebById(long id);

    @Select("select * from tbl_Web")
    public List<tblWeb> getAll();
}
