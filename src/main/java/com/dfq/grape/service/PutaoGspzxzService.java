package com.dfq.grape.service;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoGspzxz;
import com.github.pagehelper.PageInfo;

/**
 *
 */
public interface PutaoGspzxzService {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link PutaoGspzxz}
     */
    EUDataGridResult findByKinds(int pageNum, int pageSize ,PutaoGspzxz putaoGspzxz);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link PutaoGspzxz}
     */
    EUDataGridResult findByPage(int pageNum, int pageSize);

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