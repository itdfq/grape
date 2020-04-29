package com.dfq.grape.service;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoZygsxz;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface PutaoZygsxzService {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link PutaoZygsxz}
     */
    EUDataGridResult findByKinds(int pageNum, int pageSize,PutaoZygsxz putaoZygsxz);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link PutaoZygsxz}
     */
    EUDataGridResult findByPage(int pageNum, int pageSize);

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