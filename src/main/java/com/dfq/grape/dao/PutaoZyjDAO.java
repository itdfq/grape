package com.dfq.grape.dao;

import com.dfq.grape.model.PutaoZyj;
import com.github.pagehelper.Page;

/**
 *
 */
public interface PutaoZyjDAO {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link PutaoZyj}
     */
    Page<PutaoZyj> findByKinds(PutaoZyj putaoZyj);

    /**
     * 分页查询
     *
     * @return {@link PutaoZyj}
     */
    Page<PutaoZyj> findByPage();

    /**
     * 新增
     *
     * @param putaoZyj
     */
    void insert(PutaoZyj putaoZyj);

    /**
     * 修改
     *
     * @param putaoZyj
     */
    void update(PutaoZyj putaoZyj);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(PutaoZyj id);

}