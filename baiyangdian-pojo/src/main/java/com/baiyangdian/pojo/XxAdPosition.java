package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxAdPosition implements Serializable {
    private static final long serialVersionUID = 1387481876594447418L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String description;

    private Integer height;

    private String name;

    private Integer width;

    private String template;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    @Override
    public String toString() {
        return "XxAdPosition{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", description='" + description + '\'' +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", template='" + template + '\'' +
                '}';
    }
}