package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPromotionProductKey implements Serializable {
    private static final long serialVersionUID = 6716942165496637940L;
    private Long promotions;

    private Long products;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "XxPromotionProductKey{" +
                "promotions=" + promotions +
                ", products=" + products +
                '}';
    }
}