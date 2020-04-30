package com.dfq.grape.controller;

import com.dfq.grape.model.EUDataGridResult;
import com.dfq.grape.model.Users;
import com.dfq.grape.service.UsersService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    private Map<String, Object> map = new HashMap<>();


/*
    @RequestMapping("/findByPhone")
    public Map<String,Object> find(@RequestBody Users users) {
        map.clear();
        System.out.println(users);
        return map;
    }*/

    @RequestMapping("/findByPhone")
    @ResponseBody
    public EUDataGridResult findByPhone(@RequestBody Users users,@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                        @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
        System.out.println(users);
        EUDataGridResult result = usersService.findByPhone(pageNum,pageSize,users);

        return result;

    }
    /*
    public EUDataGridResult findById(Integer id) {
        try {
             usersService.findById(id);
            System.out.println(byId);
            EUDataGridResult byid;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }*/

    @RequestMapping("/findByPage")
    @ApiOperation("分页查询")
    public EUDataGridResult findByPage(@ApiParam("页号") @RequestParam(defaultValue = "1") Integer pageNum,
                                       @ApiParam("每页大小") @RequestParam(defaultValue = "15") Integer pageSize) {
        EUDataGridResult result = usersService.findByPage(pageNum,pageSize);

        return result;
    }
    @RequestMapping("/resign")
    @ApiOperation("新增")
    @ResponseBody
    public Map<String,Object> resign(@RequestBody Users users) {
        map.clear();
        try {
            System.out.println(users);
            usersService.insert(users);
            map.put("msg",1);
        } catch (Exception e) {
            map.put("msg",e.getMessage());
        }
        return map;
    }
    @RequestMapping("/update")
    @ApiOperation("修改")
    public Map<String,Object>  update(@RequestBody Users users) {
        map.clear();
        try {
            System.out.println(users);
            usersService.update(users);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return  map;
    }

    @RequestMapping("/delete")
    @ApiOperation("删除")
    public Map<String,Object> deleteById(@RequestBody Users users) {
        System.out.println(users);
        map.clear();
        try {
            usersService.deleteById(users);
            map.put("msg",1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody Users users) {
        map.clear();
        try {
            Users login = usersService.login(users);
            if (login == null) {

                map.put("msg", 0);
            } else {
                map.put("msg", 1);
            }
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        System.out.println(map);
        return map;
    }

}
