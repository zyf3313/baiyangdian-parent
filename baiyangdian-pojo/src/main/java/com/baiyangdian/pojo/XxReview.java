package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxReview implements Serializable {
    private static final long serialVersionUID = 5711652892272511713L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String content;

    private String ip;

    private Boolean isShow;

    private Integer score;

    private Long member;

    private Long product;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "XxReview{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", content='" + content + '\'' +
                ", ip='" + ip + '\'' +
                ", isShow=" + isShow +
                ", score=" + score +
                ", member=" + member +
                ", product=" + product +
                '}';
    }
}