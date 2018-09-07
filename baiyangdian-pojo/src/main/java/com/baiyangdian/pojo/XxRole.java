package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxRole implements Serializable {
    private static final long serialVersionUID = 5817361524204385207L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String description;

    private Boolean isSystem;

    private String name;

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

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "XxRole{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", description='" + description + '\'' +
                ", isSystem=" + isSystem +
                ", name='" + name + '\'' +
                '}';
    }
}