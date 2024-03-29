package com.example.demo.data.repository;

import com.example.demo.data.entity.BaseEntity;
import com.example.demo.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, PK extends Serializable> extends JpaRepository<T, PK>, JpaSpecificationExecutor<T> {



}