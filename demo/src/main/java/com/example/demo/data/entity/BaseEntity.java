package com.example.demo.data.entity;

import io.micrometer.core.lang.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity implements Serializable {

    protected Long id;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    protected Date createDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    protected Date updateDate;

    protected String imageFile;

    public static void save(User user) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public void setName() {

    }
}
