package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPromotionProductCategoryKey implements Serializable {
    private static final long serialVersionUID = 6439282049882865339L;
    private Long promotions;

    private Long productCategories;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
    }

    @Override
    public String toString() {
        return "XxPromotionProductCategoryKey{" +
                "promotions=" + promotions +
                ", productCategories=" + productCategories +
                '}';
    }
}