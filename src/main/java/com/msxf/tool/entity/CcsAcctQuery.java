package com.msxf.tool.entity;

import com.msxf.tool.model.CcsAcct;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class CcsAcctQuery extends BaseQuery<CcsAcct>{
    /**
     * 自定义查询字段
     */
    //public String xxx;

    /*
     * 组合where查询条件
    public Specification<CcsAcct> where() {
        return new Specification<CcsAcct>() {
            @Override
            public Predicate toPredicate(Root<CcsAcct> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
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
