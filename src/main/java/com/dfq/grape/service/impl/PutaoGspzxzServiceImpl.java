package com.dfq.grape.service.impl;

import com.dfq.grape.dao.PutaoGspzxzDAO;
import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoGspzxz;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.PutaoGspzxzService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PutaoGspzxzServiceImpl implements PutaoGspzxzService {

    @Autowired
    private PutaoGspzxzDAO putaoGspzxzDAO;

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByKinds(int pageNum, int pageSize, PutaoGspzxz putaoGspzxz) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoGspzxz> list = putaoGspzxzDAO.findByKinds(putaoGspzxz);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoGspzxz> usersPageInfo = new PageInfo<>(list);
        result.setTotal(usersPageInfo.getTotal());
        return result;
    }

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoGspzxz> list = putaoGspzxzDAO.findByPage();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoGspzxz> usersPageInfo = new PageInfo<>(list);
        result.setTotal(usersPageInfo.getTotal());
        return result;

    }
    @Override
    public void insert(PutaoGspzxz putaoGspzxz) {
        putaoGspzxzDAO.insert(putaoGspzxz);
    }

    @Override
    public void update(PutaoGspzxz putaoGspzxz) {
        putaoGspzxzDAO.update(putaoGspzxz);
    }

    @Override
    public void deleteById(PutaoGspzxz id) {
        putaoGspzxzDAO.deleteById(id);
    }

}