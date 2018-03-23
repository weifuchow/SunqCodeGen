<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${classNameLower}.service;

import ${basepackage}.${classNameLower}.model.*;
import ${basepackage}.${classNameLower}.repository.${className}Repository;
import ${basepackage}.utils.service.*;
import org.springframework.stereotype.Service;

@Service
public class ${className}Service extends BaseService<${className}Repository,${className}Query>{


}
