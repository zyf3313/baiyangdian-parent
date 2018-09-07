package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxParameterGroup implements Serializable {
    private static final long serialVersionUID = -4076099500556316604L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private String name;

    private Long productCategory;

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

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "XxParameterGroup{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", orders=" + orders +
                ", name='" + name + '\'' +
                ", productCategory=" + productCategory +
                '}';
    }
}