package com.baiyangdian.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XxDeposit implements Serializable {
    private static final long serialVersionUID = 1840184795951722005L;
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private BigDecimal balance;

    private BigDecimal credit;

    private BigDecimal debit;

    private String memo;

    private String operator;

    private Integer type;

    private Long member;

    private Long orders;

    private Long payment;

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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public BigDecimal getDebit() {
        return debit;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "XxDeposit{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", balance=" + balance +
                ", credit=" + credit +
                ", debit=" + debit +
                ", memo='" + memo + '\'' +
                ", operator='" + operator + '\'' +
                ", type=" + type +
                ", member=" + member +
                ", orders=" + orders +
                ", payment=" + payment +
                '}';
    }
}