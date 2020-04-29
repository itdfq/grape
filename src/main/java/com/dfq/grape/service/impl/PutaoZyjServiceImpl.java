package com.dfq.grape.service.impl;

import com.dfq.grape.dao.PutaoZyjDAO;
import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoZyj;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.PutaoZyjService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PutaoZyjServiceImpl implements PutaoZyjService {

    @Autowired
    private PutaoZyjDAO putaoZyjDAO;

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByKinds(int pageNum, int pageSize,PutaoZyj putaoZyj) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoZyj> list = putaoZyjDAO.findByKinds(putaoZyj);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoZyj> putaoZyjPageInfo = new PageInfo<>(list);
        result.setTotal(putaoZyjPageInfo.getTotal());
        return result;

    }

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoZyj> list = putaoZyjDAO.findByPage();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoZyj> putaoZyjPageInfo = new PageInfo<>(list);
        result.setTotal(putaoZyjPageInfo.getTotal());
        return result;

    }

    @Override
    public void insert(PutaoZyj putaoZyj) {
        putaoZyjDAO.insert(putaoZyj);
    }

    @Override
    public void update(PutaoZyj putaoZyj) {
        putaoZyjDAO.update(putaoZyj);
    }

    @Override
    public void deleteById(PutaoZyj id) {
        putaoZyjDAO.deleteById(id);
    }

}