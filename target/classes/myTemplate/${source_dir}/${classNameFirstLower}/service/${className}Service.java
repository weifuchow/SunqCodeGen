<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service;

import ${basepackage}.entity.${className}Query;
import ${basepackage}.model.*;
import org.springframework.stereotype.Service;
import ${basepackage}.repository.${className}Repository;

@Service
public class ${className}Service extends BaseService<${className}Repository,${className}Query>{


}
