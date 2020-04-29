package com.dfq.grape.service;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.Users;
import org.apache.ibatis.annotations.Param;


/**
 *
 */
public interface UsersService {

    /**
     * 通过phone查询单个
     *
     *
     */
    EUDataGridResult findByPhone(int pageNum, int pageSize,Users users);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link Users}
     */
    EUDataGridResult findByPage(int pageNum,int pageSize);

    /**
     * 新增
     *
     * @param users
     */
    void insert(Users users);

    /**
     * 修改
     *
     * @param users
     */
    void update(Users users);

    /**
     * 通过ID删除单个
     *
     *
     */
    void deleteById(Users users);

    /*
    * 登录
     */
    Users login(Users users);

}