<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${classNameLower}.controller;

import ${basepackage}.${classNameLower}.entity.${className}Query;
import ${basepackage}.${classNameLower}.entity.MsxfResult;
import ${basepackage}.${classNameLower}.model.*;
import org.springframework.stereotype.Service;
import ${basepackage}.${classNameLower}.service.${className}Service;
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
