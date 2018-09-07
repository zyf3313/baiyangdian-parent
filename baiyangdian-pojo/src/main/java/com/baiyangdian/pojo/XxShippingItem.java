package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxShippingItem implements Serializable {
    private static final long serialVersionUID = -845084233765415642L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String name;

    private Integer quantity;

    private String sn;

    private Long shipping;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Long getShipping() {
        return shipping;
    }

    public void setShipping(Long shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "XxShippingItem{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", sn='" + sn + '\'' +
                ", shipping=" + shipping +
                '}';
    }
}