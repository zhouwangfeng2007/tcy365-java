package com.tcy365.dao.tcy365webdb;

import com.tcy365.entity.tcy365web.tbl_FriendLinks;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface tbl_FriendLinksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbl_FriendLinks record);

    int insertSelective(tbl_FriendLinks record);

    tbl_FriendLinks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tbl_FriendLinks record);

    int updateByPrimaryKey(tbl_FriendLinks record);
}