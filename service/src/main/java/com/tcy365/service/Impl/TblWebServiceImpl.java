package com.tcy365.service.Impl;

import com.tcy365.dao.tcy365webdb.tbl_WebMapper;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TblWebServiceImpl implements ITblWebService {


    @Autowired
    private tbl_WebMapper tbl_webMapper;

    @Override
    public tbl_Web getWebById(Integer id) {
        return tbl_webMapper.selectByPrimaryKey(id);
    }

    @Override
    public tbl_Web getWebByDomain(String webDomain) {
        return tbl_webMapper.selectByDomain(webDomain);
    }

    @Override
    public List<tbl_Web> getAll() {
        return tbl_webMapper.selectAll();
    }

    @Override
    public List<tbl_Web> selectByPage(Integer pageIndex, Integer pageSize) {
        return tbl_webMapper.selectByPage(pageIndex, pageSize);
    }
}
