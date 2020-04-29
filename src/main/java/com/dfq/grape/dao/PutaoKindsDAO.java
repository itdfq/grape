package com.dfq.grape.dao;

import com.dfq.grape.model.PutaoKinds;
import com.github.pagehelper.Page;

/**
 *
 */
public interface PutaoKindsDAO {

    /**
     * 通过kinds查询单个
     *
     * @param
     * @return {@link PutaoKinds}
     */
    Page<PutaoKinds> findByKinds(PutaoKinds putaoKinds);

    /**
     * 分页查询
     *
     * @return {@link PutaoKinds}
     */
    Page<PutaoKinds> findByPage();

    /**
     * 新增
     *
     * @param putaoKinds
     */
    void insert(PutaoKinds putaoKinds);

    /**
     * 修改
     *
     * @param putaoKinds
     */
    void update(PutaoKinds putaoKinds);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(PutaoKinds id);

}