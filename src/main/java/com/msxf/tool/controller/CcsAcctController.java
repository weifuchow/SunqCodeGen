package com.msxf.tool.controller;

import com.msxf.tool.entity.CcsAcctQuery;
import com.msxf.tool.entity.MsxfResult;
import com.msxf.tool.model.*;
import org.springframework.stereotype.Service;
import com.msxf.tool.service.CcsAcctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CcsAcctController{

    @Autowired
    CcsAcctService service;

    @RequestMapping(value = "ccsAcct", method = RequestMethod.GET)
    public MsxfResult ccsAcct(CcsAcctQuery query) {
        return service.getPage(query);
    }

}
