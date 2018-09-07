package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductSpecificationValueKey implements Serializable {
    private static final long serialVersionUID = 423992462835758348L;
    private Long products;

    private Long specificationValues;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getSpecificationValues() {
        return specificationValues;
    }

    public void setSpecificationValues(Long specificationValues) {
        this.specificationValues = specificationValues;
    }

    @Override
    public String toString() {
        return "XxProductSpecificationValueKey{" +
                "products=" + products +
                ", specificationValues=" + specificationValues +
                '}';
    }
}