package com.dfq.grape.service.impl;

import com.dfq.grape.dao.UsersDAO;
import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.UsersService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;



    @Transactional(readOnly = true)
    @Override
    public EUDataGridResult findByPhone(int pageNum, int pageSize,Users phone) {
        PageHelper.startPage(pageNum, pageSize);

        List<Users> list = usersDAO.findByPhone(phone);
        System.out.println(list);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<Users> usersPageInfo = new PageInfo<>(list);
        result.setTotal(usersPageInfo.getTotal());
        return result;

    }

    @Transactional(readOnly = true)
    @Override
    //@Param("page")Integer page, @Param("rows")Integer rows
    public EUDataGridResult findByPage (int pageNum,  int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Users> list = usersDAO.findByPage();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        PageInfo<Users> usersPageInfo = new PageInfo<>(list);
        result.setTotal(usersPageInfo.getTotal());
        return result;

    }

    @Override
    public void insert(Users users) {
        usersDAO.insert(users);
    }

    @Override
    public void update(Users users) {
        usersDAO.update(users);
    }

    @Override
    public void deleteById(Users id) {
        usersDAO.deleteById(id);
    }

    @Override
    public Users login(Users users) {

        return usersDAO.login(users);
    }

}