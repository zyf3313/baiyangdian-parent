package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductSpecificationKey implements Serializable {
    private static final long serialVersionUID = 5240657498160012985L;
    private Long products;

    private Long specifications;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Long specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "XxProductSpecificationKey{" +
                "products=" + products +
                ", specifications=" + specifications +
                '}';
    }
}