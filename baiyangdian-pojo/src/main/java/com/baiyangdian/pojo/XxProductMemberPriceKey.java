package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductMemberPriceKey implements Serializable {
    private Long product;

    private Long memberPriceKey;

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getMemberPriceKey() {
        return memberPriceKey;
    }

    public void setMemberPriceKey(Long memberPriceKey) {
        this.memberPriceKey = memberPriceKey;
    }

    @Override
    public String toString() {
        return "XxProductMemberPriceKey{" +
                "product=" + product +
                ", memberPriceKey=" + memberPriceKey +
                '}';
    }
}