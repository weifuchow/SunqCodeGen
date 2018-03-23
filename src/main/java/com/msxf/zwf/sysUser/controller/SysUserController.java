package com.msxf.zwf.sysUser.controller;

import com.msxf.zwf.sysUser.entity.SysUserQuery;
import com.msxf.zwf.sysUser.entity.WeifuResult;
import com.msxf.zwf.sysUser.model.*;
import com.msxf.zwf.sysUser.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/sysUser/api")
@RestController
public class SysUserController{

    @Autowired
    SysUserService service;

    @RequestMapping(value = "/query" , method = RequestMethod.GET)
    public WeifuResult sysUser(SysUserQuery query) {
        return service.getPage(query);
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public WeifuResult addSysUser(SysUser sysUser) {
    	return WeifuResult.getIsOkResult(service.save(sysUser));
    }
    
    @RequestMapping(value = "/update" ,method = RequestMethod.POST)
    public WeifuResult UpdateSysUser(SysUser sysUser) {
    	return WeifuResult.getIsOkResult(service.save(sysUser));
    }
    
    @RequestMapping(value = "/delete" ,method = RequestMethod.GET)
    public WeifuResult UpdateSysUser(@RequestParam(value = "id" ,required = false) Long id) {
    	service.deleteById(id);	
    	return WeifuResult.getIsOkResult(null);
    }
    
}
