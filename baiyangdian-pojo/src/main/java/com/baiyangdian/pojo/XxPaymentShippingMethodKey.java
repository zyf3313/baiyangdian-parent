package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPaymentShippingMethodKey implements Serializable {
    private static final long serialVersionUID = -546671520113824769L;
    private Long paymentMethods;

    private Long shippingMethods;

    public Long getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(Long paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Long getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(Long shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    @Override
    public String toString() {
        return "XxPaymentShippingMethodKey{" +
                "paymentMethods=" + paymentMethods +
                ", shippingMethods=" + shippingMethods +
                '}';
    }
}