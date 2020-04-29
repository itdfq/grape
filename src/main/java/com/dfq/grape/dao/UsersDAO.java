package com.dfq.grape.dao;

import com.dfq.grape.model.Users;
import com.github.pagehelper.Page;

/**
 *
 */
public interface UsersDAO {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link Users}
     */
    Page<Users> findByPhone(Users users);

    /**
     * 分页查询
     *
     * @return {@link Users}
     */
    Page<Users> findByPage();

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
    //登录
    Users login(Users users);
}