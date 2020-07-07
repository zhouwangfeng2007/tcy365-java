package com.tcy365.service;

import tcy365webdb.tblWeb;

import java.util.List;

public interface WebInfoService {
   public tblWeb getWebById(long id);

   public List<tblWeb> getAll();
}
