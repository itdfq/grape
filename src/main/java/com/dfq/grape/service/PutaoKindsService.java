package com.dfq.grape.service;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoKinds;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface PutaoKindsService {

    /**

     */
    EUDataGridResult findByKinds(int pageNum, int pageSize,PutaoKinds putaoKinds);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link PutaoKinds}
     */
    EUDataGridResult findByPage(int pageNum, int pageSize);

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
     *
     */
    void deleteById(PutaoKinds putaoKinds);

}