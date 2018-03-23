package com.msxf.zwf.sysSystems.controller;

import com.msxf.zwf.utils.entity.WeifuResult;
import com.msxf.zwf.sysSystems.model.*;
import com.msxf.zwf.sysSystems.service.SysSystemsService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sysSystems/api")
@RestController
public class SysSystemsController{

    @Autowired
    SysSystemsService sysSystemsService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public WeifuResult sysSystems(SysSystemsQuery query) {
        return sysSystemsService.getPage(query);
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public WeifuResult addSysSystems(SysSystems sysSystems) {
    	return WeifuResult.getIsOkResult(
    			sysSystemsService.save(sysSystems));
    }
    
    @RequestMapping(value = "/update" ,method = RequestMethod.POST)
    public WeifuResult UpdateSysUser(SysSystems sysSystems) {
    	return WeifuResult.getIsOkResult(
    			sysSystemsService.save(sysSystems));
    }
    
    @RequestMapping(value = "/delete" ,method = RequestMethod.GET)
    public WeifuResult UpdateSysUser(@RequestParam(value = "id" ,required = true) Long id) {
    	sysSystemsService.deleteById(id);	
    	return WeifuResult.getIsOkResult(null);
    }
    
}
