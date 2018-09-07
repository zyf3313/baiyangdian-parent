package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductTagKey implements Serializable {
    private static final long serialVersionUID = -7521926276457977498L;
    private Long products;

    private Long tags;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getTags() {
        return tags;
    }

    public void setTags(Long tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "XxProductTagKey{" +
                "products=" + products +
                ", tags=" + tags +
                '}';
    }
}