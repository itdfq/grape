package com.dfq.grape.dao;

import com.dfq.grape.model.PutaoZygsxz;
import com.github.pagehelper.Page;

/**
 *
 */
public interface PutaoZygsxzDAO {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link PutaoZygsxz}
     */
    Page<PutaoZygsxz> findByKinds(PutaoZygsxz putaoZygsxz);

    /**
     * 分页查询
     *
     * @return {@link PutaoZygsxz}
     */
    Page<PutaoZygsxz> findByPage();

    /**
     * 新增
     *
     * @param putaoZygsxz
     */
    void insert(PutaoZygsxz putaoZygsxz);

    /**
     * 修改
     *
     * @param putaoZygsxz
     */
    void update(PutaoZygsxz putaoZygsxz);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(PutaoZygsxz id);

}