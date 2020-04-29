package com.dfq.grape.dao;

import com.dfq.grape.model.PutaoGspzxz;
import com.github.pagehelper.Page;

/**
 *
 */
public interface PutaoGspzxzDAO {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link PutaoGspzxz}
     */
    Page<PutaoGspzxz> findByKinds(PutaoGspzxz putaoGspzxz);

    /**
     * 分页查询
     *
     * @return {@link PutaoGspzxz}
     */
    Page<PutaoGspzxz> findByPage();

    /**
     * 新增
     *
     * @param putaoGspzxz
     */
    void insert(PutaoGspzxz putaoGspzxz);

    /**
     * 修改
     *
     * @param putaoGspzxz
     */
    void update(PutaoGspzxz putaoGspzxz);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(PutaoGspzxz id);

}