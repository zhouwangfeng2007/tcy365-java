package com.tcy365.service;




import com.tcy365.entity.tcy365web.tbl_Web;
import org.springframework.stereotype.Service;

import java.util.List;




public interface ITblWebService {
   public tbl_Web getWebById(Integer id);

   public List<tbl_Web> getAll();
}
