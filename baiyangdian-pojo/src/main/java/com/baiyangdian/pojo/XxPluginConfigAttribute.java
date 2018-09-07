package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPluginConfigAttribute extends XxPluginConfigAttributeKey implements Serializable {
    private static final long serialVersionUID = 1488044223481551880L;
    private String attributes;

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    @Override
    public String toString() {
        return "XxPluginConfigAttribute{" +
                "attributes='" + attributes + '\'' +
                '}';
    }
}