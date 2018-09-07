package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxSpecificationValue implements Serializable {
    private static final long serialVersionUID = -5478123220697030135L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private String image;

    private String name;

    private Long specification;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getSpecification() {
        return specification;
    }

    public void setSpecification(Long specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "XxSpecificationValue{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", orders=" + orders +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", specification=" + specification +
                '}';
    }
}