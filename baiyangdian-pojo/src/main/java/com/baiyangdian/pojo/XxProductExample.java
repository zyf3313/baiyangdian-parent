package com.baiyangdian.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxProductExample() {
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

        public Criteria andAllocatedStockIsNull() {
            addCriterion("allocated_stock is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockIsNotNull() {
            addCriterion("allocated_stock is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockEqualTo(Integer value) {
            addCriterion("allocated_stock =", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockNotEqualTo(Integer value) {
            addCriterion("allocated_stock <>", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockGreaterThan(Integer value) {
            addCriterion("allocated_stock >", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocated_stock >=", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockLessThan(Integer value) {
            addCriterion("allocated_stock <", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockLessThanOrEqualTo(Integer value) {
            addCriterion("allocated_stock <=", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockIn(List<Integer> values) {
            addCriterion("allocated_stock in", values, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockNotIn(List<Integer> values) {
            addCriterion("allocated_stock not in", values, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockBetween(Integer value1, Integer value2) {
            addCriterion("allocated_stock between", value1, value2, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockNotBetween(Integer value1, Integer value2) {
            addCriterion("allocated_stock not between", value1, value2, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0IsNull() {
            addCriterion("attribute_value0 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0IsNotNull() {
            addCriterion("attribute_value0 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0EqualTo(String value) {
            addCriterion("attribute_value0 =", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0NotEqualTo(String value) {
            addCriterion("attribute_value0 <>", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0GreaterThan(String value) {
            addCriterion("attribute_value0 >", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value0 >=", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0LessThan(String value) {
            addCriterion("attribute_value0 <", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0LessThanOrEqualTo(String value) {
            addCriterion("attribute_value0 <=", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0Like(String value) {
            addCriterion("attribute_value0 like", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0NotLike(String value) {
            addCriterion("attribute_value0 not like", value, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0In(List<String> values) {
            addCriterion("attribute_value0 in", values, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0NotIn(List<String> values) {
            addCriterion("attribute_value0 not in", values, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0Between(String value1, String value2) {
            addCriterion("attribute_value0 between", value1, value2, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue0NotBetween(String value1, String value2) {
            addCriterion("attribute_value0 not between", value1, value2, "attributeValue0");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1IsNull() {
            addCriterion("attribute_value1 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1IsNotNull() {
            addCriterion("attribute_value1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1EqualTo(String value) {
            addCriterion("attribute_value1 =", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1NotEqualTo(String value) {
            addCriterion("attribute_value1 <>", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1GreaterThan(String value) {
            addCriterion("attribute_value1 >", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value1 >=", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1LessThan(String value) {
            addCriterion("attribute_value1 <", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1LessThanOrEqualTo(String value) {
            addCriterion("attribute_value1 <=", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1Like(String value) {
            addCriterion("attribute_value1 like", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1NotLike(String value) {
            addCriterion("attribute_value1 not like", value, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1In(List<String> values) {
            addCriterion("attribute_value1 in", values, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1NotIn(List<String> values) {
            addCriterion("attribute_value1 not in", values, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1Between(String value1, String value2) {
            addCriterion("attribute_value1 between", value1, value2, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue1NotBetween(String value1, String value2) {
            addCriterion("attribute_value1 not between", value1, value2, "attributeValue1");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10IsNull() {
            addCriterion("attribute_value10 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10IsNotNull() {
            addCriterion("attribute_value10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10EqualTo(String value) {
            addCriterion("attribute_value10 =", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10NotEqualTo(String value) {
            addCriterion("attribute_value10 <>", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10GreaterThan(String value) {
            addCriterion("attribute_value10 >", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value10 >=", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10LessThan(String value) {
            addCriterion("attribute_value10 <", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10LessThanOrEqualTo(String value) {
            addCriterion("attribute_value10 <=", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10Like(String value) {
            addCriterion("attribute_value10 like", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10NotLike(String value) {
            addCriterion("attribute_value10 not like", value, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10In(List<String> values) {
            addCriterion("attribute_value10 in", values, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10NotIn(List<String> values) {
            addCriterion("attribute_value10 not in", values, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10Between(String value1, String value2) {
            addCriterion("attribute_value10 between", value1, value2, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue10NotBetween(String value1, String value2) {
            addCriterion("attribute_value10 not between", value1, value2, "attributeValue10");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11IsNull() {
            addCriterion("attribute_value11 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11IsNotNull() {
            addCriterion("attribute_value11 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11EqualTo(String value) {
            addCriterion("attribute_value11 =", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11NotEqualTo(String value) {
            addCriterion("attribute_value11 <>", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11GreaterThan(String value) {
            addCriterion("attribute_value11 >", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value11 >=", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11LessThan(String value) {
            addCriterion("attribute_value11 <", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11LessThanOrEqualTo(String value) {
            addCriterion("attribute_value11 <=", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11Like(String value) {
            addCriterion("attribute_value11 like", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11NotLike(String value) {
            addCriterion("attribute_value11 not like", value, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11In(List<String> values) {
            addCriterion("attribute_value11 in", values, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11NotIn(List<String> values) {
            addCriterion("attribute_value11 not in", values, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11Between(String value1, String value2) {
            addCriterion("attribute_value11 between", value1, value2, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue11NotBetween(String value1, String value2) {
            addCriterion("attribute_value11 not between", value1, value2, "attributeValue11");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12IsNull() {
            addCriterion("attribute_value12 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12IsNotNull() {
            addCriterion("attribute_value12 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12EqualTo(String value) {
            addCriterion("attribute_value12 =", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12NotEqualTo(String value) {
            addCriterion("attribute_value12 <>", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12GreaterThan(String value) {
            addCriterion("attribute_value12 >", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value12 >=", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12LessThan(String value) {
            addCriterion("attribute_value12 <", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12LessThanOrEqualTo(String value) {
            addCriterion("attribute_value12 <=", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12Like(String value) {
            addCriterion("attribute_value12 like", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12NotLike(String value) {
            addCriterion("attribute_value12 not like", value, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12In(List<String> values) {
            addCriterion("attribute_value12 in", values, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12NotIn(List<String> values) {
            addCriterion("attribute_value12 not in", values, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12Between(String value1, String value2) {
            addCriterion("attribute_value12 between", value1, value2, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue12NotBetween(String value1, String value2) {
            addCriterion("attribute_value12 not between", value1, value2, "attributeValue12");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13IsNull() {
            addCriterion("attribute_value13 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13IsNotNull() {
            addCriterion("attribute_value13 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13EqualTo(String value) {
            addCriterion("attribute_value13 =", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13NotEqualTo(String value) {
            addCriterion("attribute_value13 <>", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13GreaterThan(String value) {
            addCriterion("attribute_value13 >", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value13 >=", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13LessThan(String value) {
            addCriterion("attribute_value13 <", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13LessThanOrEqualTo(String value) {
            addCriterion("attribute_value13 <=", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13Like(String value) {
            addCriterion("attribute_value13 like", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13NotLike(String value) {
            addCriterion("attribute_value13 not like", value, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13In(List<String> values) {
            addCriterion("attribute_value13 in", values, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13NotIn(List<String> values) {
            addCriterion("attribute_value13 not in", values, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13Between(String value1, String value2) {
            addCriterion("attribute_value13 between", value1, value2, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue13NotBetween(String value1, String value2) {
            addCriterion("attribute_value13 not between", value1, value2, "attributeValue13");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14IsNull() {
            addCriterion("attribute_value14 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14IsNotNull() {
            addCriterion("attribute_value14 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14EqualTo(String value) {
            addCriterion("attribute_value14 =", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14NotEqualTo(String value) {
            addCriterion("attribute_value14 <>", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14GreaterThan(String value) {
            addCriterion("attribute_value14 >", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value14 >=", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14LessThan(String value) {
            addCriterion("attribute_value14 <", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14LessThanOrEqualTo(String value) {
            addCriterion("attribute_value14 <=", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14Like(String value) {
            addCriterion("attribute_value14 like", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14NotLike(String value) {
            addCriterion("attribute_value14 not like", value, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14In(List<String> values) {
            addCriterion("attribute_value14 in", values, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14NotIn(List<String> values) {
            addCriterion("attribute_value14 not in", values, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14Between(String value1, String value2) {
            addCriterion("attribute_value14 between", value1, value2, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue14NotBetween(String value1, String value2) {
            addCriterion("attribute_value14 not between", value1, value2, "attributeValue14");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15IsNull() {
            addCriterion("attribute_value15 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15IsNotNull() {
            addCriterion("attribute_value15 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15EqualTo(String value) {
            addCriterion("attribute_value15 =", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15NotEqualTo(String value) {
            addCriterion("attribute_value15 <>", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15GreaterThan(String value) {
            addCriterion("attribute_value15 >", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value15 >=", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15LessThan(String value) {
            addCriterion("attribute_value15 <", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15LessThanOrEqualTo(String value) {
            addCriterion("attribute_value15 <=", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15Like(String value) {
            addCriterion("attribute_value15 like", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15NotLike(String value) {
            addCriterion("attribute_value15 not like", value, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15In(List<String> values) {
            addCriterion("attribute_value15 in", values, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15NotIn(List<String> values) {
            addCriterion("attribute_value15 not in", values, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15Between(String value1, String value2) {
            addCriterion("attribute_value15 between", value1, value2, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue15NotBetween(String value1, String value2) {
            addCriterion("attribute_value15 not between", value1, value2, "attributeValue15");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16IsNull() {
            addCriterion("attribute_value16 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16IsNotNull() {
            addCriterion("attribute_value16 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16EqualTo(String value) {
            addCriterion("attribute_value16 =", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16NotEqualTo(String value) {
            addCriterion("attribute_value16 <>", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16GreaterThan(String value) {
            addCriterion("attribute_value16 >", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value16 >=", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16LessThan(String value) {
            addCriterion("attribute_value16 <", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16LessThanOrEqualTo(String value) {
            addCriterion("attribute_value16 <=", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16Like(String value) {
            addCriterion("attribute_value16 like", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16NotLike(String value) {
            addCriterion("attribute_value16 not like", value, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16In(List<String> values) {
            addCriterion("attribute_value16 in", values, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16NotIn(List<String> values) {
            addCriterion("attribute_value16 not in", values, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16Between(String value1, String value2) {
            addCriterion("attribute_value16 between", value1, value2, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue16NotBetween(String value1, String value2) {
            addCriterion("attribute_value16 not between", value1, value2, "attributeValue16");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17IsNull() {
            addCriterion("attribute_value17 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17IsNotNull() {
            addCriterion("attribute_value17 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17EqualTo(String value) {
            addCriterion("attribute_value17 =", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17NotEqualTo(String value) {
            addCriterion("attribute_value17 <>", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17GreaterThan(String value) {
            addCriterion("attribute_value17 >", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value17 >=", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17LessThan(String value) {
            addCriterion("attribute_value17 <", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17LessThanOrEqualTo(String value) {
            addCriterion("attribute_value17 <=", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17Like(String value) {
            addCriterion("attribute_value17 like", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17NotLike(String value) {
            addCriterion("attribute_value17 not like", value, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17In(List<String> values) {
            addCriterion("attribute_value17 in", values, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17NotIn(List<String> values) {
            addCriterion("attribute_value17 not in", values, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17Between(String value1, String value2) {
            addCriterion("attribute_value17 between", value1, value2, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue17NotBetween(String value1, String value2) {
            addCriterion("attribute_value17 not between", value1, value2, "attributeValue17");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18IsNull() {
            addCriterion("attribute_value18 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18IsNotNull() {
            addCriterion("attribute_value18 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18EqualTo(String value) {
            addCriterion("attribute_value18 =", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18NotEqualTo(String value) {
            addCriterion("attribute_value18 <>", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18GreaterThan(String value) {
            addCriterion("attribute_value18 >", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value18 >=", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18LessThan(String value) {
            addCriterion("attribute_value18 <", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18LessThanOrEqualTo(String value) {
            addCriterion("attribute_value18 <=", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18Like(String value) {
            addCriterion("attribute_value18 like", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18NotLike(String value) {
            addCriterion("attribute_value18 not like", value, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18In(List<String> values) {
            addCriterion("attribute_value18 in", values, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18NotIn(List<String> values) {
            addCriterion("attribute_value18 not in", values, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18Between(String value1, String value2) {
            addCriterion("attribute_value18 between", value1, value2, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue18NotBetween(String value1, String value2) {
            addCriterion("attribute_value18 not between", value1, value2, "attributeValue18");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19IsNull() {
            addCriterion("attribute_value19 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19IsNotNull() {
            addCriterion("attribute_value19 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19EqualTo(String value) {
            addCriterion("attribute_value19 =", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19NotEqualTo(String value) {
            addCriterion("attribute_value19 <>", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19GreaterThan(String value) {
            addCriterion("attribute_value19 >", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value19 >=", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19LessThan(String value) {
            addCriterion("attribute_value19 <", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19LessThanOrEqualTo(String value) {
            addCriterion("attribute_value19 <=", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19Like(String value) {
            addCriterion("attribute_value19 like", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19NotLike(String value) {
            addCriterion("attribute_value19 not like", value, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19In(List<String> values) {
            addCriterion("attribute_value19 in", values, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19NotIn(List<String> values) {
            addCriterion("attribute_value19 not in", values, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19Between(String value1, String value2) {
            addCriterion("attribute_value19 between", value1, value2, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue19NotBetween(String value1, String value2) {
            addCriterion("attribute_value19 not between", value1, value2, "attributeValue19");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2IsNull() {
            addCriterion("attribute_value2 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2IsNotNull() {
            addCriterion("attribute_value2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2EqualTo(String value) {
            addCriterion("attribute_value2 =", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2NotEqualTo(String value) {
            addCriterion("attribute_value2 <>", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2GreaterThan(String value) {
            addCriterion("attribute_value2 >", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value2 >=", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2LessThan(String value) {
            addCriterion("attribute_value2 <", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2LessThanOrEqualTo(String value) {
            addCriterion("attribute_value2 <=", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2Like(String value) {
            addCriterion("attribute_value2 like", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2NotLike(String value) {
            addCriterion("attribute_value2 not like", value, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2In(List<String> values) {
            addCriterion("attribute_value2 in", values, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2NotIn(List<String> values) {
            addCriterion("attribute_value2 not in", values, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2Between(String value1, String value2) {
            addCriterion("attribute_value2 between", value1, value2, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue2NotBetween(String value1, String value2) {
            addCriterion("attribute_value2 not between", value1, value2, "attributeValue2");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3IsNull() {
            addCriterion("attribute_value3 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3IsNotNull() {
            addCriterion("attribute_value3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3EqualTo(String value) {
            addCriterion("attribute_value3 =", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3NotEqualTo(String value) {
            addCriterion("attribute_value3 <>", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3GreaterThan(String value) {
            addCriterion("attribute_value3 >", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value3 >=", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3LessThan(String value) {
            addCriterion("attribute_value3 <", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3LessThanOrEqualTo(String value) {
            addCriterion("attribute_value3 <=", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3Like(String value) {
            addCriterion("attribute_value3 like", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3NotLike(String value) {
            addCriterion("attribute_value3 not like", value, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3In(List<String> values) {
            addCriterion("attribute_value3 in", values, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3NotIn(List<String> values) {
            addCriterion("attribute_value3 not in", values, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3Between(String value1, String value2) {
            addCriterion("attribute_value3 between", value1, value2, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue3NotBetween(String value1, String value2) {
            addCriterion("attribute_value3 not between", value1, value2, "attributeValue3");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4IsNull() {
            addCriterion("attribute_value4 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4IsNotNull() {
            addCriterion("attribute_value4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4EqualTo(String value) {
            addCriterion("attribute_value4 =", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4NotEqualTo(String value) {
            addCriterion("attribute_value4 <>", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4GreaterThan(String value) {
            addCriterion("attribute_value4 >", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value4 >=", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4LessThan(String value) {
            addCriterion("attribute_value4 <", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4LessThanOrEqualTo(String value) {
            addCriterion("attribute_value4 <=", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4Like(String value) {
            addCriterion("attribute_value4 like", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4NotLike(String value) {
            addCriterion("attribute_value4 not like", value, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4In(List<String> values) {
            addCriterion("attribute_value4 in", values, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4NotIn(List<String> values) {
            addCriterion("attribute_value4 not in", values, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4Between(String value1, String value2) {
            addCriterion("attribute_value4 between", value1, value2, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue4NotBetween(String value1, String value2) {
            addCriterion("attribute_value4 not between", value1, value2, "attributeValue4");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5IsNull() {
            addCriterion("attribute_value5 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5IsNotNull() {
            addCriterion("attribute_value5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5EqualTo(String value) {
            addCriterion("attribute_value5 =", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5NotEqualTo(String value) {
            addCriterion("attribute_value5 <>", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5GreaterThan(String value) {
            addCriterion("attribute_value5 >", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value5 >=", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5LessThan(String value) {
            addCriterion("attribute_value5 <", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5LessThanOrEqualTo(String value) {
            addCriterion("attribute_value5 <=", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5Like(String value) {
            addCriterion("attribute_value5 like", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5NotLike(String value) {
            addCriterion("attribute_value5 not like", value, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5In(List<String> values) {
            addCriterion("attribute_value5 in", values, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5NotIn(List<String> values) {
            addCriterion("attribute_value5 not in", values, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5Between(String value1, String value2) {
            addCriterion("attribute_value5 between", value1, value2, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue5NotBetween(String value1, String value2) {
            addCriterion("attribute_value5 not between", value1, value2, "attributeValue5");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6IsNull() {
            addCriterion("attribute_value6 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6IsNotNull() {
            addCriterion("attribute_value6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6EqualTo(String value) {
            addCriterion("attribute_value6 =", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6NotEqualTo(String value) {
            addCriterion("attribute_value6 <>", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6GreaterThan(String value) {
            addCriterion("attribute_value6 >", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value6 >=", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6LessThan(String value) {
            addCriterion("attribute_value6 <", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6LessThanOrEqualTo(String value) {
            addCriterion("attribute_value6 <=", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6Like(String value) {
            addCriterion("attribute_value6 like", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6NotLike(String value) {
            addCriterion("attribute_value6 not like", value, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6In(List<String> values) {
            addCriterion("attribute_value6 in", values, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6NotIn(List<String> values) {
            addCriterion("attribute_value6 not in", values, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6Between(String value1, String value2) {
            addCriterion("attribute_value6 between", value1, value2, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue6NotBetween(String value1, String value2) {
            addCriterion("attribute_value6 not between", value1, value2, "attributeValue6");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7IsNull() {
            addCriterion("attribute_value7 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7IsNotNull() {
            addCriterion("attribute_value7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7EqualTo(String value) {
            addCriterion("attribute_value7 =", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7NotEqualTo(String value) {
            addCriterion("attribute_value7 <>", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7GreaterThan(String value) {
            addCriterion("attribute_value7 >", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value7 >=", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7LessThan(String value) {
            addCriterion("attribute_value7 <", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7LessThanOrEqualTo(String value) {
            addCriterion("attribute_value7 <=", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7Like(String value) {
            addCriterion("attribute_value7 like", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7NotLike(String value) {
            addCriterion("attribute_value7 not like", value, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7In(List<String> values) {
            addCriterion("attribute_value7 in", values, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7NotIn(List<String> values) {
            addCriterion("attribute_value7 not in", values, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7Between(String value1, String value2) {
            addCriterion("attribute_value7 between", value1, value2, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue7NotBetween(String value1, String value2) {
            addCriterion("attribute_value7 not between", value1, value2, "attributeValue7");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8IsNull() {
            addCriterion("attribute_value8 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8IsNotNull() {
            addCriterion("attribute_value8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8EqualTo(String value) {
            addCriterion("attribute_value8 =", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8NotEqualTo(String value) {
            addCriterion("attribute_value8 <>", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8GreaterThan(String value) {
            addCriterion("attribute_value8 >", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value8 >=", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8LessThan(String value) {
            addCriterion("attribute_value8 <", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8LessThanOrEqualTo(String value) {
            addCriterion("attribute_value8 <=", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8Like(String value) {
            addCriterion("attribute_value8 like", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8NotLike(String value) {
            addCriterion("attribute_value8 not like", value, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8In(List<String> values) {
            addCriterion("attribute_value8 in", values, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8NotIn(List<String> values) {
            addCriterion("attribute_value8 not in", values, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8Between(String value1, String value2) {
            addCriterion("attribute_value8 between", value1, value2, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue8NotBetween(String value1, String value2) {
            addCriterion("attribute_value8 not between", value1, value2, "attributeValue8");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9IsNull() {
            addCriterion("attribute_value9 is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9IsNotNull() {
            addCriterion("attribute_value9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9EqualTo(String value) {
            addCriterion("attribute_value9 =", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9NotEqualTo(String value) {
            addCriterion("attribute_value9 <>", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9GreaterThan(String value) {
            addCriterion("attribute_value9 >", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9GreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value9 >=", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9LessThan(String value) {
            addCriterion("attribute_value9 <", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9LessThanOrEqualTo(String value) {
            addCriterion("attribute_value9 <=", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9Like(String value) {
            addCriterion("attribute_value9 like", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9NotLike(String value) {
            addCriterion("attribute_value9 not like", value, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9In(List<String> values) {
            addCriterion("attribute_value9 in", values, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9NotIn(List<String> values) {
            addCriterion("attribute_value9 not in", values, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9Between(String value1, String value2) {
            addCriterion("attribute_value9 between", value1, value2, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andAttributeValue9NotBetween(String value1, String value2) {
            addCriterion("attribute_value9 not between", value1, value2, "attributeValue9");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Long value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Long value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Long value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Long value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Long value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Long> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Long> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Long value1, Long value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Long value1, Long value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Boolean value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Boolean value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Boolean value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Boolean value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Boolean value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Boolean> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Boolean> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsListIsNull() {
            addCriterion("is_list is null");
            return (Criteria) this;
        }

        public Criteria andIsListIsNotNull() {
            addCriterion("is_list is not null");
            return (Criteria) this;
        }

        public Criteria andIsListEqualTo(Boolean value) {
            addCriterion("is_list =", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListNotEqualTo(Boolean value) {
            addCriterion("is_list <>", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListGreaterThan(Boolean value) {
            addCriterion("is_list >", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_list >=", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListLessThan(Boolean value) {
            addCriterion("is_list <", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListLessThanOrEqualTo(Boolean value) {
            addCriterion("is_list <=", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListIn(List<Boolean> values) {
            addCriterion("is_list in", values, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListNotIn(List<Boolean> values) {
            addCriterion("is_list not in", values, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListBetween(Boolean value1, Boolean value2) {
            addCriterion("is_list between", value1, value2, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_list not between", value1, value2, "isList");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNull() {
            addCriterion("is_marketable is null");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNotNull() {
            addCriterion("is_marketable is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarketableEqualTo(Boolean value) {
            addCriterion("is_marketable =", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotEqualTo(Boolean value) {
            addCriterion("is_marketable <>", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThan(Boolean value) {
            addCriterion("is_marketable >", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_marketable >=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLessThan(Boolean value) {
            addCriterion("is_marketable <", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_marketable <=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIn(List<Boolean> values) {
            addCriterion("is_marketable in", values, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotIn(List<Boolean> values) {
            addCriterion("is_marketable not in", values, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_marketable between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_marketable not between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNull() {
            addCriterion("is_top is null");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNotNull() {
            addCriterion("is_top is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopEqualTo(Boolean value) {
            addCriterion("is_top =", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotEqualTo(Boolean value) {
            addCriterion("is_top <>", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThan(Boolean value) {
            addCriterion("is_top >", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_top >=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThan(Boolean value) {
            addCriterion("is_top <", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThanOrEqualTo(Boolean value) {
            addCriterion("is_top <=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopIn(List<Boolean> values) {
            addCriterion("is_top in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotIn(List<Boolean> values) {
            addCriterion("is_top not in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopBetween(Boolean value1, Boolean value2) {
            addCriterion("is_top between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_top not between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMonthHitsIsNull() {
            addCriterion("month_hits is null");
            return (Criteria) this;
        }

        public Criteria andMonthHitsIsNotNull() {
            addCriterion("month_hits is not null");
            return (Criteria) this;
        }

        public Criteria andMonthHitsEqualTo(Long value) {
            addCriterion("month_hits =", value, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsNotEqualTo(Long value) {
            addCriterion("month_hits <>", value, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsGreaterThan(Long value) {
            addCriterion("month_hits >", value, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("month_hits >=", value, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsLessThan(Long value) {
            addCriterion("month_hits <", value, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsLessThanOrEqualTo(Long value) {
            addCriterion("month_hits <=", value, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsIn(List<Long> values) {
            addCriterion("month_hits in", values, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsNotIn(List<Long> values) {
            addCriterion("month_hits not in", values, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsBetween(Long value1, Long value2) {
            addCriterion("month_hits between", value1, value2, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsNotBetween(Long value1, Long value2) {
            addCriterion("month_hits not between", value1, value2, "monthHits");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateIsNull() {
            addCriterion("month_hits_date is null");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateIsNotNull() {
            addCriterion("month_hits_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateEqualTo(Date value) {
            addCriterion("month_hits_date =", value, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateNotEqualTo(Date value) {
            addCriterion("month_hits_date <>", value, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateGreaterThan(Date value) {
            addCriterion("month_hits_date >", value, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("month_hits_date >=", value, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateLessThan(Date value) {
            addCriterion("month_hits_date <", value, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateLessThanOrEqualTo(Date value) {
            addCriterion("month_hits_date <=", value, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateIn(List<Date> values) {
            addCriterion("month_hits_date in", values, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateNotIn(List<Date> values) {
            addCriterion("month_hits_date not in", values, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateBetween(Date value1, Date value2) {
            addCriterion("month_hits_date between", value1, value2, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthHitsDateNotBetween(Date value1, Date value2) {
            addCriterion("month_hits_date not between", value1, value2, "monthHitsDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesIsNull() {
            addCriterion("month_sales is null");
            return (Criteria) this;
        }

        public Criteria andMonthSalesIsNotNull() {
            addCriterion("month_sales is not null");
            return (Criteria) this;
        }

        public Criteria andMonthSalesEqualTo(Long value) {
            addCriterion("month_sales =", value, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesNotEqualTo(Long value) {
            addCriterion("month_sales <>", value, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesGreaterThan(Long value) {
            addCriterion("month_sales >", value, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("month_sales >=", value, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesLessThan(Long value) {
            addCriterion("month_sales <", value, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesLessThanOrEqualTo(Long value) {
            addCriterion("month_sales <=", value, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesIn(List<Long> values) {
            addCriterion("month_sales in", values, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesNotIn(List<Long> values) {
            addCriterion("month_sales not in", values, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesBetween(Long value1, Long value2) {
            addCriterion("month_sales between", value1, value2, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesNotBetween(Long value1, Long value2) {
            addCriterion("month_sales not between", value1, value2, "monthSales");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateIsNull() {
            addCriterion("month_sales_date is null");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateIsNotNull() {
            addCriterion("month_sales_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateEqualTo(Date value) {
            addCriterion("month_sales_date =", value, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateNotEqualTo(Date value) {
            addCriterion("month_sales_date <>", value, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateGreaterThan(Date value) {
            addCriterion("month_sales_date >", value, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("month_sales_date >=", value, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateLessThan(Date value) {
            addCriterion("month_sales_date <", value, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateLessThanOrEqualTo(Date value) {
            addCriterion("month_sales_date <=", value, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateIn(List<Date> values) {
            addCriterion("month_sales_date in", values, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateNotIn(List<Date> values) {
            addCriterion("month_sales_date not in", values, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateBetween(Date value1, Date value2) {
            addCriterion("month_sales_date between", value1, value2, "monthSalesDate");
            return (Criteria) this;
        }

        public Criteria andMonthSalesDateNotBetween(Date value1, Date value2) {
            addCriterion("month_sales_date not between", value1, value2, "monthSalesDate");
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

        public Criteria andPointEqualTo(Long value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Long value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Long value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Long value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Long value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Long value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Long> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Long> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Long value1, Long value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Long value1, Long value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Long value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Long value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Long value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Long value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Long value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Long> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Long> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Long value1, Long value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Long value1, Long value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreCountIsNull() {
            addCriterion("score_count is null");
            return (Criteria) this;
        }

        public Criteria andScoreCountIsNotNull() {
            addCriterion("score_count is not null");
            return (Criteria) this;
        }

        public Criteria andScoreCountEqualTo(Long value) {
            addCriterion("score_count =", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountNotEqualTo(Long value) {
            addCriterion("score_count <>", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountGreaterThan(Long value) {
            addCriterion("score_count >", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountGreaterThanOrEqualTo(Long value) {
            addCriterion("score_count >=", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountLessThan(Long value) {
            addCriterion("score_count <", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountLessThanOrEqualTo(Long value) {
            addCriterion("score_count <=", value, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountIn(List<Long> values) {
            addCriterion("score_count in", values, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountNotIn(List<Long> values) {
            addCriterion("score_count not in", values, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountBetween(Long value1, Long value2) {
            addCriterion("score_count between", value1, value2, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andScoreCountNotBetween(Long value1, Long value2) {
            addCriterion("score_count not between", value1, value2, "scoreCount");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNull() {
            addCriterion("seo_description is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNotNull() {
            addCriterion("seo_description is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionEqualTo(String value) {
            addCriterion("seo_description =", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotEqualTo(String value) {
            addCriterion("seo_description <>", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThan(String value) {
            addCriterion("seo_description >", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seo_description >=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThan(String value) {
            addCriterion("seo_description <", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seo_description <=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLike(String value) {
            addCriterion("seo_description like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotLike(String value) {
            addCriterion("seo_description not like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIn(List<String> values) {
            addCriterion("seo_description in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotIn(List<String> values) {
            addCriterion("seo_description not in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionBetween(String value1, String value2) {
            addCriterion("seo_description between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("seo_description not between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seo_keywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seo_keywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seo_keywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seo_keywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seo_keywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seo_keywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seo_keywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seo_keywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seo_keywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seo_keywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seo_keywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNull() {
            addCriterion("seo_title is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNotNull() {
            addCriterion("seo_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleEqualTo(String value) {
            addCriterion("seo_title =", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotEqualTo(String value) {
            addCriterion("seo_title <>", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThan(String value) {
            addCriterion("seo_title >", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seo_title >=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThan(String value) {
            addCriterion("seo_title <", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThanOrEqualTo(String value) {
            addCriterion("seo_title <=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLike(String value) {
            addCriterion("seo_title like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotLike(String value) {
            addCriterion("seo_title not like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIn(List<String> values) {
            addCriterion("seo_title in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotIn(List<String> values) {
            addCriterion("seo_title not in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleBetween(String value1, String value2) {
            addCriterion("seo_title between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotBetween(String value1, String value2) {
            addCriterion("seo_title not between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockMemoIsNull() {
            addCriterion("stock_memo is null");
            return (Criteria) this;
        }

        public Criteria andStockMemoIsNotNull() {
            addCriterion("stock_memo is not null");
            return (Criteria) this;
        }

        public Criteria andStockMemoEqualTo(String value) {
            addCriterion("stock_memo =", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotEqualTo(String value) {
            addCriterion("stock_memo <>", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoGreaterThan(String value) {
            addCriterion("stock_memo >", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoGreaterThanOrEqualTo(String value) {
            addCriterion("stock_memo >=", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoLessThan(String value) {
            addCriterion("stock_memo <", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoLessThanOrEqualTo(String value) {
            addCriterion("stock_memo <=", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoLike(String value) {
            addCriterion("stock_memo like", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotLike(String value) {
            addCriterion("stock_memo not like", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoIn(List<String> values) {
            addCriterion("stock_memo in", values, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotIn(List<String> values) {
            addCriterion("stock_memo not in", values, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoBetween(String value1, String value2) {
            addCriterion("stock_memo between", value1, value2, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotBetween(String value1, String value2) {
            addCriterion("stock_memo not between", value1, value2, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Long value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Long value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Long value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Long value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Long value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Long> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Long> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Long value1, Long value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Long value1, Long value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andWeekHitsIsNull() {
            addCriterion("week_hits is null");
            return (Criteria) this;
        }

        public Criteria andWeekHitsIsNotNull() {
            addCriterion("week_hits is not null");
            return (Criteria) this;
        }

        public Criteria andWeekHitsEqualTo(Long value) {
            addCriterion("week_hits =", value, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsNotEqualTo(Long value) {
            addCriterion("week_hits <>", value, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsGreaterThan(Long value) {
            addCriterion("week_hits >", value, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsGreaterThanOrEqualTo(Long value) {
            addCriterion("week_hits >=", value, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsLessThan(Long value) {
            addCriterion("week_hits <", value, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsLessThanOrEqualTo(Long value) {
            addCriterion("week_hits <=", value, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsIn(List<Long> values) {
            addCriterion("week_hits in", values, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsNotIn(List<Long> values) {
            addCriterion("week_hits not in", values, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsBetween(Long value1, Long value2) {
            addCriterion("week_hits between", value1, value2, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsNotBetween(Long value1, Long value2) {
            addCriterion("week_hits not between", value1, value2, "weekHits");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateIsNull() {
            addCriterion("week_hits_date is null");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateIsNotNull() {
            addCriterion("week_hits_date is not null");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateEqualTo(Date value) {
            addCriterion("week_hits_date =", value, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateNotEqualTo(Date value) {
            addCriterion("week_hits_date <>", value, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateGreaterThan(Date value) {
            addCriterion("week_hits_date >", value, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("week_hits_date >=", value, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateLessThan(Date value) {
            addCriterion("week_hits_date <", value, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateLessThanOrEqualTo(Date value) {
            addCriterion("week_hits_date <=", value, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateIn(List<Date> values) {
            addCriterion("week_hits_date in", values, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateNotIn(List<Date> values) {
            addCriterion("week_hits_date not in", values, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateBetween(Date value1, Date value2) {
            addCriterion("week_hits_date between", value1, value2, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekHitsDateNotBetween(Date value1, Date value2) {
            addCriterion("week_hits_date not between", value1, value2, "weekHitsDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesIsNull() {
            addCriterion("week_sales is null");
            return (Criteria) this;
        }

        public Criteria andWeekSalesIsNotNull() {
            addCriterion("week_sales is not null");
            return (Criteria) this;
        }

        public Criteria andWeekSalesEqualTo(Long value) {
            addCriterion("week_sales =", value, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesNotEqualTo(Long value) {
            addCriterion("week_sales <>", value, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesGreaterThan(Long value) {
            addCriterion("week_sales >", value, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("week_sales >=", value, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesLessThan(Long value) {
            addCriterion("week_sales <", value, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesLessThanOrEqualTo(Long value) {
            addCriterion("week_sales <=", value, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesIn(List<Long> values) {
            addCriterion("week_sales in", values, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesNotIn(List<Long> values) {
            addCriterion("week_sales not in", values, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesBetween(Long value1, Long value2) {
            addCriterion("week_sales between", value1, value2, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesNotBetween(Long value1, Long value2) {
            addCriterion("week_sales not between", value1, value2, "weekSales");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateIsNull() {
            addCriterion("week_sales_date is null");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateIsNotNull() {
            addCriterion("week_sales_date is not null");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateEqualTo(Date value) {
            addCriterion("week_sales_date =", value, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateNotEqualTo(Date value) {
            addCriterion("week_sales_date <>", value, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateGreaterThan(Date value) {
            addCriterion("week_sales_date >", value, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("week_sales_date >=", value, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateLessThan(Date value) {
            addCriterion("week_sales_date <", value, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateLessThanOrEqualTo(Date value) {
            addCriterion("week_sales_date <=", value, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateIn(List<Date> values) {
            addCriterion("week_sales_date in", values, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateNotIn(List<Date> values) {
            addCriterion("week_sales_date not in", values, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateBetween(Date value1, Date value2) {
            addCriterion("week_sales_date between", value1, value2, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeekSalesDateNotBetween(Date value1, Date value2) {
            addCriterion("week_sales_date not between", value1, value2, "weekSalesDate");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(Long value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(Long value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(Long value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(Long value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(Long value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(Long value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<Long> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<Long> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(Long value1, Long value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(Long value1, Long value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(Long value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(Long value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(Long value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(Long value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(Long value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(Long value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<Long> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<Long> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(Long value1, Long value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(Long value1, Long value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNull() {
            addCriterion("product_category is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNotNull() {
            addCriterion("product_category is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryEqualTo(Long value) {
            addCriterion("product_category =", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotEqualTo(Long value) {
            addCriterion("product_category <>", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThan(Long value) {
            addCriterion("product_category >", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThanOrEqualTo(Long value) {
            addCriterion("product_category >=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThan(Long value) {
            addCriterion("product_category <", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThanOrEqualTo(Long value) {
            addCriterion("product_category <=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIn(List<Long> values) {
            addCriterion("product_category in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotIn(List<Long> values) {
            addCriterion("product_category not in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryBetween(Long value1, Long value2) {
            addCriterion("product_category between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotBetween(Long value1, Long value2) {
            addCriterion("product_category not between", value1, value2, "productCategory");
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