package com.dfq.grape.controller;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoGspzxz;
import com.dfq.grape.service.PutaoGspzxzService;
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
@RequestMapping("/putaoGspzxzs")
@Api(tags = "")
public class PutaoGspzxzController {
    @Autowired
    private PutaoGspzxzService putaoGspzxzService;
    private Map<String, Object> map = new HashMap<>();
    @RequestMapping("/findByKinds")
    @ResponseBody
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize,@RequestBody PutaoGspzxz putaoGspzxz) {
        EUDataGridResult result = putaoGspzxzService.findByKinds(pageNum,pageSize,putaoGspzxz);
        return result;
    }

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
        EUDataGridResult result = putaoGspzxzService.findByPage(pageNum,pageSize);
        return result;
    }

    @RequestMapping("/insert")
    @ApiOperation("新增")
    public Map<String,Object> insert(@RequestBody PutaoGspzxz putaoGspzxz) {
        map.clear();
        System.out.println(putaoGspzxz);
        try {
            putaoGspzxzService.insert(putaoGspzxz);
            System.out.println("到这里");
            map.put("msg", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
        }
        return map;

    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody PutaoGspzxz putaoGspzxz) {
        System.out.println(putaoGspzxz);
        map.clear();
        try {
            putaoGspzxzService.update(putaoGspzxz);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;

    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public Map<String, Object> deleteById(@RequestBody PutaoGspzxz putaoGspzxz) {
        map.clear();
        System.out.println(putaoGspzxz);
        try {
            putaoGspzxzService.deleteById(putaoGspzxz);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }
}
