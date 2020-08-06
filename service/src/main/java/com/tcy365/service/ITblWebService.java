package com.tcy365.service;




import com.github.pagehelper.PageInfo;
import com.tcy365.entity.dto.UpdateWebInput;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;




public interface ITblWebService {
     tbl_Web getWebById(Integer id);

     tbl_Web getWebByDomain(String webDomain);

     List<tbl_Web> getAll();

     PageInfo<tbl_Web> selectByPage( Integer pageIndex,Integer pageSize, HashMap<String, Object> condition);

     Boolean changeVisible(Integer isVisible ,Integer id);

     Boolean saveWeb(UpdateWebInput input);
}
