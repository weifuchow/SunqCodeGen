package com.msxf.zwf.controller;

import com.msxf.zwf.entity.ActivitiesCourseQuery;
import com.msxf.zwf.entity.MsxfResult;
import com.msxf.zwf.model.*;
import org.springframework.stereotype.Service;
import com.msxf.zwf.service.ActivitiesCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActivitiesCourseController{

    @Autowired
    ActivitiesCourseService service;

    @RequestMapping(value = "activitiesCourse", method = RequestMethod.GET)
    public MsxfResult activitiesCourse(ActivitiesCourseQuery query) {
        return service.getPage(query);
    }

}
