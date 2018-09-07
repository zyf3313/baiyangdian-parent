package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductParameterValueKey implements Serializable {
    private static final long serialVersionUID = -2690279853208365437L;
    private Long product;

    private Long parameterValueKey;

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getParameterValueKey() {
        return parameterValueKey;
    }

    public void setParameterValueKey(Long parameterValueKey) {
        this.parameterValueKey = parameterValueKey;
    }

    @Override
    public String toString() {
        return "XxProductParameterValueKey{" +
                "product=" + product +
                ", parameterValueKey=" + parameterValueKey +
                '}';
    }
}