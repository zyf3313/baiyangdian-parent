package com.baiyangdian.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XxRefunds implements Serializable {
    private static final long serialVersionUID = -7330063677838398701L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String account;

    private BigDecimal amount;

    private String bank;

    private String memo;

    private String operator;

    private String payee;

    private String paymentMethod;

    private String sn;

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
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

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
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
        return "XxRefunds{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", account='" + account + '\'' +
                ", amount=" + amount +
                ", bank='" + bank + '\'' +
                ", memo='" + memo + '\'' +
                ", operator='" + operator + '\'' +
                ", payee='" + payee + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", sn='" + sn + '\'' +
                ", type=" + type +
                ", orders=" + orders +
                '}';
    }
}