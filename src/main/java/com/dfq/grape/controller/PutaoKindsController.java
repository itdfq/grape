package com.dfq.grape.controller;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.PutaoGspzxz;
import com.dfq.grape.model.PutaoKinds;
import com.dfq.grape.service.PutaoKindsService;
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
@RequestMapping("/putaoKindss")
public class PutaoKindsController {
    @Autowired
    private PutaoKindsService putaoKindsService;
    private Map<String, Object> map = new HashMap<>();

    @RequestMapping("/findByKinds")
    @ResponseBody
    public EUDataGridResult findByKinds(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize,@RequestBody PutaoKinds putaoKinds) {
        System.out.println(putaoKinds);
        EUDataGridResult result = putaoKindsService.findByKinds(pageNum,pageSize,putaoKinds);
        return result;
    }

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
        EUDataGridResult result = putaoKindsService.findByPage(pageNum,pageSize);
        return result;
    }

    @RequestMapping("/insert")
    @ApiOperation("新增")
    public Map<String,Object> insert(@RequestBody PutaoKinds putaoKinds) {
        map.clear();
        System.out.println(putaoKinds);
        try {
            putaoKindsService.insert(putaoKinds);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;

    }

    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object>  update(@RequestBody PutaoKinds putaoKinds) {
        map.clear();
        try {
            putaoKindsService.update(putaoKinds);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;

    }

    @RequestMapping("/delete")
    @ApiOperation("通过ID删除单个")
    public @ResponseBody Map<String,Object> deleteById( @RequestBody PutaoKinds putaoKinds) {
        map.clear();
        System.out.println(putaoKinds);
        try {
            putaoKindsService.deleteById(putaoKinds);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
}
