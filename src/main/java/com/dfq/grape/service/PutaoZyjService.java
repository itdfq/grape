package com.dfq.grape.service;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoZyj;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface PutaoZyjService {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link PutaoZyj}
     */
    EUDataGridResult findByKinds(int pageNum, int pageSize,PutaoZyj putaoZyj);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link PutaoZyj}
     */
    EUDataGridResult findByPage(int pageNum, int pageSize);

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
     *
     */
    void deleteById(PutaoZyj putaoZyj);

}