package com.dfq.grape.service.impl;

import com.dfq.grape.dao.PutaoKindsDAO;
import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoKinds;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.PutaoKindsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PutaoKindsServiceImpl implements PutaoKindsService {

    @Autowired
    private PutaoKindsDAO putaoKindsDAO;
    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByKinds(int pageNum, int pageSize,PutaoKinds putaoKinds) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoKinds> list = putaoKindsDAO.findByKinds(putaoKinds);

        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoKinds> putaoKindsPageInfo = new PageInfo<>(list);
        result.setTotal(putaoKindsPageInfo.getTotal());
        return result;
    }

    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PutaoKinds> list = putaoKindsDAO.findByPage();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<PutaoKinds> putaoKindsPageInfo = new PageInfo<>(list);
        result.setTotal(putaoKindsPageInfo.getTotal());
        return result;
    }

    @Override
    public void insert(PutaoKinds putaoKinds) {
        putaoKindsDAO.insert(putaoKinds);
    }

    @Override
    public void update(PutaoKinds putaoKinds) {
        putaoKindsDAO.update(putaoKinds);
    }

    @Override
    public void deleteById(PutaoKinds putaoKinds) {
        putaoKindsDAO.deleteById(putaoKinds);
    }

}