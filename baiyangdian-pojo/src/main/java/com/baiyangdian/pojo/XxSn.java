package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxSn implements Serializable {
    private static final long serialVersionUID = -2726428258766371345L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long lastValue;

    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getLastValue() {
        return lastValue;
    }

    public void setLastValue(Long lastValue) {
        this.lastValue = lastValue;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "XxSn{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", lastValue=" + lastValue +
                ", type=" + type +
                '}';
    }
}