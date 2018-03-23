<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${classNameLower}.service;

import ${basepackage}.${classNameLower}.entity.${className}Query;
import ${basepackage}.${classNameLower}.model.*;
import org.springframework.stereotype.Service;
import ${basepackage}.${classNameLower}.repository.${className}Repository;

@Service
public class ${className}Service extends BaseService<${className}Repository,${className}Query>{


}
