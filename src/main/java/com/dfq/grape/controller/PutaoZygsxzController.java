package com.dfq.grape.controller;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoZygsxz;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.PutaoZygsxzService;
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
@RequestMapping("/putaoZygsxzs")
@Api(tags = "")
public class PutaoZygsxzController {
    @Autowired
    private PutaoZygsxzService putaoZygsxzService;
    private Map<String, Object> map = new HashMap<>();
    @RequestMapping("/findByKinds")
    @ResponseBody
    public EUDataGridResult findByPhone(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize,@RequestBody PutaoZygsxz users) {
        System.out.println(users);
        EUDataGridResult result = putaoZygsxzService.findByKinds(pageNum,pageSize,users);
        return result;

    }

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
        EUDataGridResult result = putaoZygsxzService.findByPage(pageNum, pageSize);
        return result;
    }
    @RequestMapping("/insert")
    public Map<String,Object> insert(@RequestBody PutaoZygsxz putaoZygsxz) {
        map.clear();
        System.out.println(putaoZygsxz);
        try {
            putaoZygsxzService.insert(putaoZygsxz);
            map.put("msg", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
        }
        return map;

    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object> update(@RequestBody PutaoZygsxz putaoZygsxz) {
        System.out.println(putaoZygsxz);
        map.clear();
        try {
            putaoZygsxzService.update(putaoZygsxz);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;

    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public  Map<String, Object>  deleteById(@RequestBody PutaoZygsxz putaoZygsxz) {
        map.clear();
        System.out.println(putaoZygsxz);
        try {
            putaoZygsxzService.deleteById(putaoZygsxz);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;

    }
}
