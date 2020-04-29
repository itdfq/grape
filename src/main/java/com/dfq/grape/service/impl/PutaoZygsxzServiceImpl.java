package com.dfq.grape.service.impl;

import com.dfq.grape.dao.PutaoZygsxzDAO;
import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoZygsxz;
import com.dfq.grape.service.PutaoZygsxzService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PutaoZygsxzServiceImpl implements PutaoZygsxzService {

    @Autowired
    private PutaoZygsxzDAO putaoZygsxzDAO;

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByKinds(int pageNum, int pageSize, PutaoZygsxz putaoZygsxz) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoZygsxz> list = putaoZygsxzDAO.findByKinds(putaoZygsxz);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoZygsxz> putaoZygsxzPageInfo = new PageInfo<>(list);
        result.setTotal(putaoZygsxzPageInfo.getTotal());
        return result;
    }

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoZygsxz> list = putaoZygsxzDAO.findByPage();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoZygsxz> putaoZygsxzPageInfo = new PageInfo<>(list);
        result.setTotal(putaoZygsxzPageInfo.getTotal());
        return result;

    }

    @Override
    public void insert(PutaoZygsxz putaoZygsxz) {
        putaoZygsxzDAO.insert(putaoZygsxz);
    }

    @Override
    public void update(PutaoZygsxz putaoZygsxz) {
        putaoZygsxzDAO.update(putaoZygsxz);
    }

    @Override
    public void deleteById(PutaoZygsxz id) {
        putaoZygsxzDAO.deleteById(id);
    }

}