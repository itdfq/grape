package com.dfq.grape.service.impl;

import com.dfq.grape.dao.MsbDAO;
import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.Msb;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.MsbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MsbServiceImpl implements MsbService {

    @Autowired
    private MsbDAO msbDAO;

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByKinds(int pageNum, int pageSize,Msb msb) {
        PageHelper.startPage(pageNum, pageSize);
        List<Msb> list = msbDAO.findByKinds(msb);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<Msb> usersPageInfo = new PageInfo<>(list);
        result.setTotal(usersPageInfo.getTotal());
        return result;

    }

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Msb> list = msbDAO.findByPage();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<Msb> usersPageInfo = new PageInfo<>(list);
        result.setTotal(usersPageInfo.getTotal());
        return result;

    }

    @Override
    public void insert(Msb msb) {
        msbDAO.insert(msb);
    }

    @Override
    public void update(Msb msb) {
        msbDAO.update(msb);
    }

    @Override
    public void deleteById(Msb id) {
        msbDAO.deleteById(id);
    }

}