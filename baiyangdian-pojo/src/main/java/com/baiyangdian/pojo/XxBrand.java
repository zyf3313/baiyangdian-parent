package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxBrand implements Serializable {
    private static final long serialVersionUID = 7882048513535804127L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private String logo;

    private String name;

    private Integer type;

    private String url;

    private String introduction;

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

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
    @Override
    public String toString() {
        return "XxBrand{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", orders=" + orders +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}