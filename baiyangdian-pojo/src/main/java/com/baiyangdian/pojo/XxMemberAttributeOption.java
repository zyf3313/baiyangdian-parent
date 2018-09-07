package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxMemberAttributeOption implements Serializable {
    private static final long serialVersionUID = 60640424868093236L;
    private Long memberAttribute;

    private String options;

    public Long getMemberAttribute() {
        return memberAttribute;
    }

    public void setMemberAttribute(Long memberAttribute) {
        this.memberAttribute = memberAttribute;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    @Override
    public String toString() {
        return "XxMemberAttributeOption{" +
                "memberAttribute=" + memberAttribute +
                ", options='" + options + '\'' +
                '}';
    }
}