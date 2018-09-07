package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxLogWithBLOBs extends XxLog implements Serializable {
    private static final long serialVersionUID = 7978937711648167294L;
    private String content;

    private String parameter;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    @Override
    public String toString() {
        return "XxLogWithBLOBs{" +
                "content='" + content + '\'' +
                ", parameter='" + parameter + '\'' +
                '}';
    }
}