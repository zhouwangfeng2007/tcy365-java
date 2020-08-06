package com.tcy365.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tcy365.dao.tcy365webdb.tbl_TkdMapper;
import com.tcy365.dao.tcy365webdb.tbl_WebMapper;
import com.tcy365.entity.dto.UpdateWebInput;
import com.tcy365.entity.tcy365webdb.tbl_Tkd;
import com.tcy365.entity.tcy365webdb.tbl_Web;
import com.tcy365.service.ITblTkdService;
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

    @Autowired
    private ITblTkdService tkdService;
    @Autowired
    private tbl_TkdMapper tkdMapper;

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
    public PageInfo<tbl_Web> selectByPage(Integer pageIndex, Integer pageSize, HashMap<String, Object> condition) {
        PageHelper.startPage(pageIndex, pageSize);

        var webList = tbl_webMapper.selectByPage(condition);
        var pageInfo = new PageInfo<>(webList);
        return pageInfo;
    }

    @Override
    public Boolean changeVisible(Integer isVisible, Integer id) {
        return tbl_webMapper.updateVisible(isVisible, id) > 0;
    }

    @Override
    public Boolean saveWeb(UpdateWebInput input) {
        if (input.id > 0) {
            tbl_Web existsWeb = getWebById(input.id);
            existsWeb.webname = input.webname;
            existsWeb.channelid = input.channelid;
            existsWeb.indexstatjs=input.indexstatjs;
            existsWeb.title=input.title;
            existsWeb.description=input.description;
            existsWeb.keywords=input.keywords;
            Boolean result = tbl_webMapper.updateByPrimaryKey(existsWeb) > 0;
            SaveTkd(input);
            return result;
        } else {
            tbl_Web newWeb = new tbl_Web();
            newWeb.webname = input.webname;
            newWeb.channelid = input.channelid;
            Boolean result = tbl_webMapper.insert(newWeb) > 0;
            return result;
        }
    }

    private void SaveTkd(UpdateWebInput input) {
        tbl_Tkd tkd = tkdService.getMobileWebTkd(input.webdomain);
        if (tkd != null) {
            tkd.title=input.mTitle;
            tkd.keywords=input.mKeyWords;
            tkd.discription=input.mDescription;
            tkdMapper.updateByPrimaryKey(tkd);
        }
    }
}
