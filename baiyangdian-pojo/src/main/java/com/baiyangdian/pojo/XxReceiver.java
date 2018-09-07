package com.baiyangdian.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxReceiver implements Serializable {
    private static final long serialVersionUID = 6109844702158242666L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String address;

    private String areaName;

    private String consignee;

    private Boolean isDefault;

    private String phone;

    private String zipCode;

    private Long area;

    private Long member;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "XxReceiver{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", address='" + address + '\'' +
                ", areaName='" + areaName + '\'' +
                ", consignee='" + consignee + '\'' +
                ", isDefault=" + isDefault +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", area=" + area +
                ", member=" + member +
                '}';
    }
}