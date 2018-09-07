package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxCartItem implements Serializable {
    private static final long serialVersionUID = -2618568914323533317L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer quantity;

    private Long cart;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getCart() {
        return cart;
    }

    public void setCart(Long cart) {
        this.cart = cart;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "XxCartItem{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", quantity=" + quantity +
                ", cart=" + cart +
                ", product=" + product +
                '}';
    }
}