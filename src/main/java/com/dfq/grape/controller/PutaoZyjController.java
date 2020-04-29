package com.dfq.grape.controller;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoZyj;
import com.dfq.grape.service.PutaoZyjService;
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
@RequestMapping("/putaoZyj")
public class PutaoZyjController {
    @Autowired
    private PutaoZyjService putaoZyjService;
    private Map<String, Object> map = new HashMap<>();
    @RequestMapping("/findByKinds")
    @ResponseBody
    public EUDataGridResult findByKinds(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize,@RequestBody PutaoZyj putaoZyj) {
        System.out.println(putaoZyj);
        EUDataGridResult result = putaoZyjService.findByKinds(pageNum, pageSize,putaoZyj);
        return result;
    }


    @RequestMapping("/findByPage")
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
            EUDataGridResult result = putaoZyjService.findByPage(pageNum, pageSize);
            return result;
    }
    @RequestMapping("/insert")
    @ApiOperation("新增")
    public Map<String,Object> insert(@RequestBody PutaoZyj putaoZyj) {
        map.clear();
        System.out.println(putaoZyj);
        try {
            putaoZyjService.insert(putaoZyj);
            map.put("msg", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
        }
        return map;
    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object>  update(@RequestBody PutaoZyj putaoZyj) {
        System.out.println(putaoZyj);
        map.clear();
        try {
            putaoZyjService.update(putaoZyj);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;

    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public Map<String, Object> deleteById(@ApiParam("ID") @RequestBody  PutaoZyj putaoZyj) {
        map.clear();
        System.out.println(putaoZyj);
        try {
            putaoZyjService.deleteById(putaoZyj);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }
}
