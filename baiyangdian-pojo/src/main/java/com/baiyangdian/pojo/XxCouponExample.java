package com.baiyangdian.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxCouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndPriceIsNull() {
            addCriterion("end_price is null");
            return (Criteria) this;
        }

        public Criteria andEndPriceIsNotNull() {
            addCriterion("end_price is not null");
            return (Criteria) this;
        }

        public Criteria andEndPriceEqualTo(BigDecimal value) {
            addCriterion("end_price =", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceNotEqualTo(BigDecimal value) {
            addCriterion("end_price <>", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceGreaterThan(BigDecimal value) {
            addCriterion("end_price >", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("end_price >=", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceLessThan(BigDecimal value) {
            addCriterion("end_price <", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("end_price <=", value, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceIn(List<BigDecimal> values) {
            addCriterion("end_price in", values, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceNotIn(List<BigDecimal> values) {
            addCriterion("end_price not in", values, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_price between", value1, value2, "endPrice");
            return (Criteria) this;
        }

        public Criteria andEndPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_price not between", value1, value2, "endPrice");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Boolean value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIsNull() {
            addCriterion("is_exchange is null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIsNotNull() {
            addCriterion("is_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeEqualTo(Boolean value) {
            addCriterion("is_exchange =", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotEqualTo(Boolean value) {
            addCriterion("is_exchange <>", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGreaterThan(Boolean value) {
            addCriterion("is_exchange >", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_exchange >=", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeLessThan(Boolean value) {
            addCriterion("is_exchange <", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_exchange <=", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIn(List<Boolean> values) {
            addCriterion("is_exchange in", values, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotIn(List<Boolean> values) {
            addCriterion("is_exchange not in", values, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exchange between", value1, value2, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exchange not between", value1, value2, "isExchange");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorIsNull() {
            addCriterion("price_operator is null");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorIsNotNull() {
            addCriterion("price_operator is not null");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorEqualTo(Integer value) {
            addCriterion("price_operator =", value, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorNotEqualTo(Integer value) {
            addCriterion("price_operator <>", value, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorGreaterThan(Integer value) {
            addCriterion("price_operator >", value, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_operator >=", value, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorLessThan(Integer value) {
            addCriterion("price_operator <", value, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("price_operator <=", value, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorIn(List<Integer> values) {
            addCriterion("price_operator in", values, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorNotIn(List<Integer> values) {
            addCriterion("price_operator not in", values, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorBetween(Integer value1, Integer value2) {
            addCriterion("price_operator between", value1, value2, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("price_operator not between", value1, value2, "priceOperator");
            return (Criteria) this;
        }

        public Criteria andPriceValueIsNull() {
            addCriterion("price_value is null");
            return (Criteria) this;
        }

        public Criteria andPriceValueIsNotNull() {
            addCriterion("price_value is not null");
            return (Criteria) this;
        }

        public Criteria andPriceValueEqualTo(BigDecimal value) {
            addCriterion("price_value =", value, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueNotEqualTo(BigDecimal value) {
            addCriterion("price_value <>", value, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueGreaterThan(BigDecimal value) {
            addCriterion("price_value >", value, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_value >=", value, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueLessThan(BigDecimal value) {
            addCriterion("price_value <", value, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_value <=", value, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueIn(List<BigDecimal> values) {
            addCriterion("price_value in", values, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueNotIn(List<BigDecimal> values) {
            addCriterion("price_value not in", values, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_value between", value1, value2, "priceValue");
            return (Criteria) this;
        }

        public Criteria andPriceValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_value not between", value1, value2, "priceValue");
            return (Criteria) this;
        }

        public Criteria andStartPriceIsNull() {
            addCriterion("start_price is null");
            return (Criteria) this;
        }

        public Criteria andStartPriceIsNotNull() {
            addCriterion("start_price is not null");
            return (Criteria) this;
        }

        public Criteria andStartPriceEqualTo(BigDecimal value) {
            addCriterion("start_price =", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotEqualTo(BigDecimal value) {
            addCriterion("start_price <>", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceGreaterThan(BigDecimal value) {
            addCriterion("start_price >", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_price >=", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceLessThan(BigDecimal value) {
            addCriterion("start_price <", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_price <=", value, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceIn(List<BigDecimal> values) {
            addCriterion("start_price in", values, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotIn(List<BigDecimal> values) {
            addCriterion("start_price not in", values, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_price between", value1, value2, "startPrice");
            return (Criteria) this;
        }

        public Criteria andStartPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_price not between", value1, value2, "startPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}