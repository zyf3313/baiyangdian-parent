package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxProductParameterValue extends XxProductParameterValueKey implements Serializable {
    private static final long serialVersionUID = -7629432086946428870L;
    private String parameterValue;

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue == null ? null : parameterValue.trim();
    }

    @Override
    public String toString() {
        return "XxProductParameterValue{" +
                "parameterValue='" + parameterValue + '\'' +
                '}';
    }
}