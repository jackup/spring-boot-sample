package com.example.demo.service;

import com.example.demo.data.entity.BaseEntity;
import com.example.demo.data.repository.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class BaseService<T extends BaseEntity, PK extends Serializable> {

    /*
     * Get BaseRepository
     *
     * */
    public abstract BaseRepository<T, PK> getRepository();

    /*
     * Save
     *
     * */
    @Transactional
    public T save(T entity) {
        entity.setCreateDate(new Date());
        return getRepository().save(entity);
    }

    /*
     * Update
     *
     * */
    @Transactional
    public T update(T entity) {
        entity.setUpdateDate(new Date());
        return getRepository().save(entity);
    }


    /*
     * List All Table
     *
     * */
    public List<T> all() {
        return (List<T>) getRepository().findAll();
    }


    /*
     * Delete
     *
     * */
    public String delete(Long id) {

        try {
            getRepository().deleteById((PK) id);
            return "0";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public String deleteAll() {

        try {
            getRepository().deleteAll();
            return "0";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
