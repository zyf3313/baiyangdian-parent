package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductCategoryBrandKey implements Serializable {
    private static final long serialVersionUID = 897505403538026653L;
    private Long productCategories;

    private Long brands;

    public Long getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
    }

    public Long getBrands() {
        return brands;
    }

    public void setBrands(Long brands) {
        this.brands = brands;
    }

    @Override
    public String toString() {
        return "XxProductCategoryBrandKey{" +
                "productCategories=" + productCategories +
                ", brands=" + brands +
                '}';
    }
}