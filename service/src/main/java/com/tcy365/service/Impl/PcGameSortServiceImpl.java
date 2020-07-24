package com.tcy365.service.Impl;

import com.tcy365.dao.tcy365webdb.tbl_PCGameSortMapper;
import com.tcy365.entity.tcy365webdb.tbl_PCGameSort;
import com.tcy365.service.IPcGameSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcGameSortServiceImpl implements IPcGameSortService {

    @Autowired
    private tbl_PCGameSortMapper pcGameSortMapper;

    public List<tbl_PCGameSort> getPcGameSortBy(Integer tblWebId, Integer sortType) {
        List<tbl_PCGameSort> result = pcGameSortMapper.GetPcGameSortBy(tblWebId, sortType);
        return result;
    }
}
