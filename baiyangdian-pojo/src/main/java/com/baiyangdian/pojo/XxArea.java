package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxArea implements Serializable {
    private static final long serialVersionUID = -8467099062080167726L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private String name;

    private String treePath;

    private Long parent;

    private String fullName;

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

    public String getTreePath() {
        return treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    @Override
    public String toString() {
        return "XxArea{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", orders=" + orders +
                ", name='" + name + '\'' +
                ", treePath='" + treePath + '\'' +
                ", parent=" + parent +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}