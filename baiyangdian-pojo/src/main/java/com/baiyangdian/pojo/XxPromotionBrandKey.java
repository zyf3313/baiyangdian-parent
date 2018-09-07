package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPromotionBrandKey implements Serializable {
    private static final long serialVersionUID = -2564821876572035951L;
    private Long promotions;

    private Long brands;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getBrands() {
        return brands;
    }

    public void setBrands(Long brands) {
        this.brands = brands;
    }

    @Override
    public String toString() {
        return "XxPromotionBrandKey{" +
                "promotions=" + promotions +
                ", brands=" + brands +
                '}';
    }
}