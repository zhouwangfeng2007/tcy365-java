package com.tcy365.service;




import com.github.pagehelper.PageInfo;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;




public interface ITblWebService {
   public tbl_Web getWebById(Integer id);

   public tbl_Web getWebByDomain(String webDomain);

   public List<tbl_Web> getAll();

   public PageInfo<tbl_Web> selectByPage( Integer pageIndex,Integer pageSize, HashMap<String, Object> condition);
}
