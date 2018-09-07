package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxCart implements Serializable {
    private static final long serialVersionUID = -8216819132977670227L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String cartKey;

    private Long member;

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

    public String getCartKey() {
        return cartKey;
    }

    public void setCartKey(String cartKey) {
        this.cartKey = cartKey == null ? null : cartKey.trim();
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "XxCart{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", cartKey='" + cartKey + '\'' +
                ", member=" + member +
                '}';
    }
}