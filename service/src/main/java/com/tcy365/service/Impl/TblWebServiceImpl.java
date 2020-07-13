package com.tcy365.service.Impl;

import com.tcy365.dao.tcy365webdb.ITblWebDao;
import com.tcy365.entity.tcy365web.tblWeb;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TblWebServiceImpl implements ITblWebService {

    @Autowired
    private ITblWebDao ITblWebDao;


    @Override
    public tblWeb getWebById(long id) {
        return ITblWebDao.getWebById(id);
    }

    @Override
    public List<tblWeb> getAll() {
        return ITblWebDao.getAll();
    }
}
