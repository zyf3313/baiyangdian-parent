package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxOrderLog implements Serializable {
    private static final long serialVersionUID = 5295493626198394245L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String content;

    private String operator;

    private Integer type;

    private Long orders;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "XxOrderLog{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", content='" + content + '\'' +
                ", operator='" + operator + '\'' +
                ", type=" + type +
                ", orders=" + orders +
                '}';
    }
}