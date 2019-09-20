package com.example.demo.data.entity;

import io.micrometer.core.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product extends BaseEntity {

    @Id
    @NonNull
    @Override
    public Long getId() {
        return super.getId();
    }

    private String name;
    private String test;
    private String detail;
    private int type;

    public String getDetail() {
        return detail;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
