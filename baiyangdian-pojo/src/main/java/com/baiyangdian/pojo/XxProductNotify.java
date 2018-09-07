package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxProductNotify implements Serializable {
    private static final long serialVersionUID = -826137171689858621L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String email;

    private Boolean hasSent;

    private Long member;

    private Long product;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getHasSent() {
        return hasSent;
    }

    public void setHasSent(Boolean hasSent) {
        this.hasSent = hasSent;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "XxProductNotify{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", email='" + email + '\'' +
                ", hasSent=" + hasSent +
                ", member=" + member +
                ", product=" + product +
                '}';
    }
}