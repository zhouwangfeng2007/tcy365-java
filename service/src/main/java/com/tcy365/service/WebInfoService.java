package com.tcy365.service;



import com.tcy365.entity.tcy365web.tblWeb;

import java.util.List;

public interface WebInfoService {
   public tblWeb getWebById(long id);

   public List<tblWeb> getAll();
}
