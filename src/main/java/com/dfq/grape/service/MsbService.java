package com.dfq.grape.service;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.Msb;
import com.github.pagehelper.PageInfo;
import sun.security.x509.EDIPartyName;

import java.util.Map;

/**
 *
 */
public interface MsbService {

    /**
     * 通过ID查询单个
     *
     *
     * @return {@link Msb}
     */
    EUDataGridResult findByKinds(int pageNum, int pageSize,Msb msb);

    /**
     * 分页查询
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link Msb}
     */
    EUDataGridResult findByPage(int pageNum, int pageSize);

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