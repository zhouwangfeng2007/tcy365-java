package com.tcy365.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tcy365.dao.tcy365webdb.tbl_WebMapper;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblWebService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
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
    public PageInfo<tbl_Web> selectByPage(Integer pageIndex,Integer pageSize, HashMap<String, Object> condition) {
        PageHelper.startPage(pageIndex, pageSize);

        var webList= tbl_webMapper.selectByPage(condition);
        var pageInfo=new PageInfo<>(webList);
        return pageInfo;
    }
}
