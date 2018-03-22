<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.controller;

import ${basepackage}.entity.${className}Query;
import ${basepackage}.entity.MsxfResult;
import ${basepackage}.model.*;
import org.springframework.stereotype.Service;
import ${basepackage}.service.${className}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ${className}Controller{

    @Autowired
    ${className}Service service;

    @RequestMapping(value = "${classNameLower}", method = RequestMethod.GET)
    public MsxfResult ${classNameLower}(${className}Query query) {
        return service.getPage(query);
    }

}
