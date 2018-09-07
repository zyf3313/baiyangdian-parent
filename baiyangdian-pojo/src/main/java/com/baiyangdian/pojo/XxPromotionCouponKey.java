package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPromotionCouponKey implements Serializable {
    private static final long serialVersionUID = -8519832603618604898L;
    private Long promotions;

    private Long coupons;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getCoupons() {
        return coupons;
    }

    public void setCoupons(Long coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "XxPromotionCouponKey{" +
                "promotions=" + promotions +
                ", coupons=" + coupons +
                '}';
    }
}