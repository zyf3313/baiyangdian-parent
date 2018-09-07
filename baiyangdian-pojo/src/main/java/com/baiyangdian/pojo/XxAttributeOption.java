package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxAttributeOption implements Serializable {
    private static final long serialVersionUID = -8591619879489266636L;
    private Long attribute;

    private String options;

    public Long getAttribute() {
        return attribute;
    }

    public void setAttribute(Long attribute) {
        this.attribute = attribute;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    @Override
    public String toString() {
        return "XxAttributeOption{" +
                "attribute=" + attribute +
                ", options='" + options + '\'' +
                '}';
    }
}