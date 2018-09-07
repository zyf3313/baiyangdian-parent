package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxPluginConfigAttributeKey implements Serializable {
    private static final long serialVersionUID = 152614427566094743L;
    private Long pluginConfig;

    private String attributesKey;

    public Long getPluginConfig() {
        return pluginConfig;
    }

    public void setPluginConfig(Long pluginConfig) {
        this.pluginConfig = pluginConfig;
    }

    public String getAttributesKey() {
        return attributesKey;
    }

    public void setAttributesKey(String attributesKey) {
        this.attributesKey = attributesKey == null ? null : attributesKey.trim();
    }

    @Override
    public String toString() {
        return "XxPluginConfigAttributeKey{" +
                "pluginConfig=" + pluginConfig +
                ", attributesKey='" + attributesKey + '\'' +
                '}';
    }
}