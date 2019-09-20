package com.example.demo.data.entity;

import io.micrometer.core.lang.NonNull;

import javax.persistence.*;

@Entity
public class User extends BaseEntity {

    @Id
    @NonNull
    @Override
    public Long getId() {
        return super.getId();
    }

    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
