package com.qf.manager.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class PoetryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoetryExample() {
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

        public Criteria andPoetryIdIsNull() {
            addCriterion("poetry_id is null");
            return (Criteria) this;
        }

        public Criteria andPoetryIdIsNotNull() {
            addCriterion("poetry_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryIdEqualTo(Integer value) {
            addCriterion("poetry_id =", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotEqualTo(Integer value) {
            addCriterion("poetry_id <>", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdGreaterThan(Integer value) {
            addCriterion("poetry_id >", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("poetry_id >=", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdLessThan(Integer value) {
            addCriterion("poetry_id <", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdLessThanOrEqualTo(Integer value) {
            addCriterion("poetry_id <=", value, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdIn(List<Integer> values) {
            addCriterion("poetry_id in", values, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotIn(List<Integer> values) {
            addCriterion("poetry_id not in", values, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdBetween(Integer value1, Integer value2) {
            addCriterion("poetry_id between", value1, value2, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("poetry_id not between", value1, value2, "poetryId");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleIsNull() {
            addCriterion("poetry_title is null");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleIsNotNull() {
            addCriterion("poetry_title is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleEqualTo(String value) {
            addCriterion("poetry_title =", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleNotEqualTo(String value) {
            addCriterion("poetry_title <>", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleGreaterThan(String value) {
            addCriterion("poetry_title >", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("poetry_title >=", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleLessThan(String value) {
            addCriterion("poetry_title <", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleLessThanOrEqualTo(String value) {
            addCriterion("poetry_title <=", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleLike(String value) {
            addCriterion("poetry_title like", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleNotLike(String value) {
            addCriterion("poetry_title not like", value, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleIn(List<String> values) {
            addCriterion("poetry_title in", values, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleNotIn(List<String> values) {
            addCriterion("poetry_title not in", values, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleBetween(String value1, String value2) {
            addCriterion("poetry_title between", value1, value2, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryTitleNotBetween(String value1, String value2) {
            addCriterion("poetry_title not between", value1, value2, "poetryTitle");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyIsNull() {
            addCriterion("poetry_body is null");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyIsNotNull() {
            addCriterion("poetry_body is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyEqualTo(String value) {
            addCriterion("poetry_body =", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyNotEqualTo(String value) {
            addCriterion("poetry_body <>", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyGreaterThan(String value) {
            addCriterion("poetry_body >", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyGreaterThanOrEqualTo(String value) {
            addCriterion("poetry_body >=", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyLessThan(String value) {
            addCriterion("poetry_body <", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyLessThanOrEqualTo(String value) {
            addCriterion("poetry_body <=", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyLike(String value) {
            addCriterion("poetry_body like", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyNotLike(String value) {
            addCriterion("poetry_body not like", value, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyIn(List<String> values) {
            addCriterion("poetry_body in", values, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyNotIn(List<String> values) {
            addCriterion("poetry_body not in", values, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyBetween(String value1, String value2) {
            addCriterion("poetry_body between", value1, value2, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryBodyNotBetween(String value1, String value2) {
            addCriterion("poetry_body not between", value1, value2, "poetryBody");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorIsNull() {
            addCriterion("poetry_author is null");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorIsNotNull() {
            addCriterion("poetry_author is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorEqualTo(String value) {
            addCriterion("poetry_author =", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorNotEqualTo(String value) {
            addCriterion("poetry_author <>", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorGreaterThan(String value) {
            addCriterion("poetry_author >", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("poetry_author >=", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorLessThan(String value) {
            addCriterion("poetry_author <", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorLessThanOrEqualTo(String value) {
            addCriterion("poetry_author <=", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorLike(String value) {
            addCriterion("poetry_author like", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorNotLike(String value) {
            addCriterion("poetry_author not like", value, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorIn(List<String> values) {
            addCriterion("poetry_author in", values, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorNotIn(List<String> values) {
            addCriterion("poetry_author not in", values, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorBetween(String value1, String value2) {
            addCriterion("poetry_author between", value1, value2, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryAuthorNotBetween(String value1, String value2) {
            addCriterion("poetry_author not between", value1, value2, "poetryAuthor");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyIsNull() {
            addCriterion("poetry_dynasty is null");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyIsNotNull() {
            addCriterion("poetry_dynasty is not null");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyEqualTo(String value) {
            addCriterion("poetry_dynasty =", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyNotEqualTo(String value) {
            addCriterion("poetry_dynasty <>", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyGreaterThan(String value) {
            addCriterion("poetry_dynasty >", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyGreaterThanOrEqualTo(String value) {
            addCriterion("poetry_dynasty >=", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyLessThan(String value) {
            addCriterion("poetry_dynasty <", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyLessThanOrEqualTo(String value) {
            addCriterion("poetry_dynasty <=", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyLike(String value) {
            addCriterion("poetry_dynasty like", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyNotLike(String value) {
            addCriterion("poetry_dynasty not like", value, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyIn(List<String> values) {
            addCriterion("poetry_dynasty in", values, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyNotIn(List<String> values) {
            addCriterion("poetry_dynasty not in", values, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyBetween(String value1, String value2) {
            addCriterion("poetry_dynasty between", value1, value2, "poetryDynasty");
            return (Criteria) this;
        }

        public Criteria andPoetryDynastyNotBetween(String value1, String value2) {
            addCriterion("poetry_dynasty not between", value1, value2, "poetryDynasty");
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