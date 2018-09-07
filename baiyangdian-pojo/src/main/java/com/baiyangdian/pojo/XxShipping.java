package com.baiyangdian.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XxShipping implements Serializable {
    private static final long serialVersionUID = -8060951970961917024L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String address;

    private String area;

    private String consignee;

    private String deliveryCorp;

    private String deliveryCorpCode;

    private String deliveryCorpUrl;

    private BigDecimal freight;

    private String memo;

    private String operator;

    private String phone;

    private String shippingMethod;

    private String sn;

    private String trackingNo;

    private String zipCode;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getDeliveryCorp() {
        return deliveryCorp;
    }

    public void setDeliveryCorp(String deliveryCorp) {
        this.deliveryCorp = deliveryCorp == null ? null : deliveryCorp.trim();
    }

    public String getDeliveryCorpCode() {
        return deliveryCorpCode;
    }

    public void setDeliveryCorpCode(String deliveryCorpCode) {
        this.deliveryCorpCode = deliveryCorpCode == null ? null : deliveryCorpCode.trim();
    }

    public String getDeliveryCorpUrl() {
        return deliveryCorpUrl;
    }

    public void setDeliveryCorpUrl(String deliveryCorpUrl) {
        this.deliveryCorpUrl = deliveryCorpUrl == null ? null : deliveryCorpUrl.trim();
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod == null ? null : shippingMethod.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo == null ? null : trackingNo.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "XxShipping{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", consignee='" + consignee + '\'' +
                ", deliveryCorp='" + deliveryCorp + '\'' +
                ", deliveryCorpCode='" + deliveryCorpCode + '\'' +
                ", deliveryCorpUrl='" + deliveryCorpUrl + '\'' +
                ", freight=" + freight +
                ", memo='" + memo + '\'' +
                ", operator='" + operator + '\'' +
                ", phone='" + phone + '\'' +
                ", shippingMethod='" + shippingMethod + '\'' +
                ", sn='" + sn + '\'' +
                ", trackingNo='" + trackingNo + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", orders=" + orders +
                '}';
    }
}