
package com.msxf.zwf.utils.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.msxf.zwf.utils.entity.BaseQuery;
import com.msxf.zwf.utils.entity.PageResult;
import com.msxf.zwf.utils.entity.WeifuResult;

/**
 * Created by chuangang.li on 2017/1/19.
 */
public class BaseService<T extends JpaRepository & JpaSpecificationExecutor, Q extends BaseQuery> {
    @Autowired
    protected T repository;

    /***
     * 通用分页查询
     */
    public <S> WeifuResult getPage(Q query) {
        PageResult<S> pageResult =new PageResult<S>();

        Page<S> page = null;
        if (query.where() == null) {
            page = repository.findAll(query.getPageReq());
        }else {
            page = repository.findAll(query.where(), query.getPageReq());
        }

        pageResult.setPageCount(page.getTotalPages());
        pageResult.setTotal(page.getTotalElements());
        pageResult.setPageList(page.getContent());

        WeifuResult result = new WeifuResult();
        result.setData(pageResult);

        return result;
    }

    public <S> List<S> getAll() {
        return repository.findAll();
    }

    public <S> S findById(Serializable id) {
        return (S) repository.findOne(id);
    }

    public void deleteById(Serializable id) {
        repository.delete(id);
    }

    public <S> void deleteById(S entity) {
        repository.delete(entity);
    }

    public <S> S save(S entity) {
        return (S) repository.save(entity);
    }

    public <S> S saveAndFlush(S entity) {
        repository.saveAndFlush(entity);
        return entity;
    }

    public boolean exist(Serializable id) {
        return repository.exists(id);
    }
}
