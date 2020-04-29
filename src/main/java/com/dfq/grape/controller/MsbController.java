package com.dfq.grape.controller;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.Msb;
import com.dfq.grape.service.MsbService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/msbs")

public class MsbController {
    @Autowired
    private MsbService msbService;
    private Map<String, Object> map = new HashMap<>();
    @RequestMapping("/findByKinds")
    @ResponseBody
    public EUDataGridResult findByKinds(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize,@RequestBody Msb msb) {
        EUDataGridResult result = msbService.findByKinds(pageNum,pageSize,msb);
        System.out.println(msb);
        return result;
    }

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
        EUDataGridResult result = msbService.findByPage(pageNum,pageSize);
        return result;
    }

    @RequestMapping("/insert")
    @ApiOperation("新增")
    public Map<String,Object> insert(@RequestBody Msb msb) {
        map.clear();
        System.out.println(msb);
        try {
            msbService.insert(msb);
            map.put("msg", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
        }
        return map;

    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody Msb msb) {
        System.out.println(msb);
        map.clear();
        try {
            msbService.update(msb);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;

    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public  Map<String, Object> deleteById(@RequestBody Msb msb) {
        map.clear();
        System.out.println(msb);
        try {
            msbService.deleteById(msb);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }
}
