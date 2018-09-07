package com.baiyangdian.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XxCoupon implements Serializable {
    private static final long serialVersionUID = -8577887717030464342L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Date beginDate;

    private Date endDate;

    private BigDecimal endPrice;

    private Boolean isEnabled;

    private Boolean isExchange;

    private String name;

    private Integer point;

    private String prefix;

    private Integer priceOperator;

    private BigDecimal priceValue;

    private BigDecimal startPrice;

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

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsExchange() {
        return isExchange;
    }

    public void setIsExchange(Boolean isExchange) {
        this.isExchange = isExchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public Integer getPriceOperator() {
        return priceOperator;
    }

    public void setPriceOperator(Integer priceOperator) {
        this.priceOperator = priceOperator;
    }

    public BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    @Override
    public String toString() {
        return "XxCoupon{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", endPrice=" + endPrice +
                ", isEnabled=" + isEnabled +
                ", isExchange=" + isExchange +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", prefix='" + prefix + '\'' +
                ", priceOperator=" + priceOperator +
                ", priceValue=" + priceValue +
                ", startPrice=" + startPrice +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}