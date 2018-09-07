package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxDeliveryTemplate implements Serializable {
    private static final long serialVersionUID = -5314288028778693561L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String background;

    private Integer height;

    private Boolean isDefault;

    private String memo;

    private String name;

    private Integer offsetx;

    private Integer offsety;

    private Integer width;

    private String content;

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

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOffsetx() {
        return offsetx;
    }

    public void setOffsetx(Integer offsetx) {
        this.offsetx = offsetx;
    }

    public Integer getOffsety() {
        return offsety;
    }

    public void setOffsety(Integer offsety) {
        this.offsety = offsety;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "XxDeliveryTemplate{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", background='" + background + '\'' +
                ", height=" + height +
                ", isDefault=" + isDefault +
                ", memo='" + memo + '\'' +
                ", name='" + name + '\'' +
                ", offsetx=" + offsetx +
                ", offsety=" + offsety +
                ", width=" + width +
                ", content='" + content + '\'' +
                '}';
    }
}