
package com.msxf.zwf.sysSystems.model;

import com.msxf.zwf.sysSystems.model.SysSystems;
import com.msxf.zwf.utils.entity.BaseQuery;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class SysSystemsQuery extends BaseQuery<SysSystems>{
    /**
     * 自定义查询字段
     */
    //public String xxx;

    /*
     * 组合where查询条件
    public Specification<SysSystems> where() {
        return new Specification<SysSystems>() {
            @Override
            public Predicate toPredicate(Root<SysSystems> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate where = null;
                if (!StringUtils.isEmpty(getKeyword())) {
                    where = criteriaBuilder.like(root.get("acctNbr").as(String.class), "%" + getKeyword() + "%");
                }
                return where == null ? null : criteriaQuery.where(where).getRestriction();
            }
        };
    }
    */
}
