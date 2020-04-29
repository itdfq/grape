package com.dfq.grape.dao;

import com.dfq.grape.model.Msb;
import com.github.pagehelper.Page;

/**
 *
 */
public interface MsbDAO {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link Msb}
     */
    Page<Msb> findByKinds(Msb msb);

    /**
     * 分页查询
     *
     * @return {@link Msb}
     */
    Page<Msb> findByPage();

    /**
     * 新增
     *
     * @param msb
     */
    void insert(Msb msb);

    /**
     * 修改
     *
     * @param msb
     */
    void update(Msb msb);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Msb id);

}