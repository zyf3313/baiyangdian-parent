package com.baiyangdian.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class XxProductMemberPrice extends XxProductMemberPriceKey implements Serializable {
    private BigDecimal memberPrice;

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    @Override
    public String toString() {
        return "XxProductMemberPrice{" +
                "memberPrice=" + memberPrice +
                '}';
    }
}