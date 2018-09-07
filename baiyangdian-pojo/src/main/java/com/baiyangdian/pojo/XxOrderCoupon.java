package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxOrderCoupon implements Serializable {
    private static final long serialVersionUID = 456585841843790843L;
    private Long orders;

    private Long coupons;

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCoupons() {
        return coupons;
    }

    public void setCoupons(Long coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "XxOrderCoupon{" +
                "orders=" + orders +
                ", coupons=" + coupons +
                '}';
    }
}