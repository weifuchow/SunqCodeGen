activitiesCourse
package com.msxf.zwf.entity;

import com.msxf.zwf.model.ActivitiesCourse;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ActivitiesCourseQuery extends BaseQuery<ActivitiesCourse>{
    /**
     * 自定义查询字段
     */
    //public String xxx;

    /*
     * 组合where查询条件
    public Specification<ActivitiesCourse> where() {
        return new Specification<ActivitiesCourse>() {
            @Override
            public Predicate toPredicate(Root<ActivitiesCourse> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
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
