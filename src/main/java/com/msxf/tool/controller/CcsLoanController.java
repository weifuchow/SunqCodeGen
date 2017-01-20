package com.msxf.tool.controller;

import com.msxf.tool.entity.CcsLoanQuery;
import com.msxf.tool.entity.MsxfResult;
import com.msxf.tool.model.*;
import org.springframework.stereotype.Service;
import com.msxf.tool.service.CcsLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CcsLoanController{

    @Autowired
    CcsLoanService service;

    @RequestMapping(value = "ccsLoan", method = RequestMethod.GET)
    public MsxfResult ccsLoan(CcsLoanQuery query) {
        return service.getPage(query);
    }

}
