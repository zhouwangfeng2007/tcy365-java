package com.tcy365.service.Impl;

import com.tcy365.dao.tcy365webdb.tblWebDao;
import com.tcy365.entity.tcy365web.tblWeb;
import com.tcy365.service.WebInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WebInfoServiceImpl  implements WebInfoService {

    @Autowired
    private tblWebDao tblWebDao;


    @Override
    public tblWeb getWebById(long id) {
        return tblWebDao.getWebById(id);
    }

    @Override
    public List<tblWeb> getAll() {
        return tblWebDao.getAll();
    }
}
