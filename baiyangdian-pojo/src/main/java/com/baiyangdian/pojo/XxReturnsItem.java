package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxReturnsItem implements Serializable {
    private static final long serialVersionUID = 6413035205989783623L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String name;

    private Integer quantity;

    private String sn;

    private Long returns;

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

    public Long getReturns() {
        return returns;
    }

    public void setReturns(Long returns) {
        this.returns = returns;
    }

    @Override
    public String toString() {
        return "XxReturnsItem{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", sn='" + sn + '\'' +
                ", returns=" + returns +
                '}';
    }
}