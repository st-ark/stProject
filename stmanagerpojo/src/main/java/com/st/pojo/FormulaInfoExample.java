package com.st.pojo;

import java.util.ArrayList;
import java.util.List;

public class FormulaInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormulaInfoExample() {
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

        public Criteria andFormulaIdIsNull() {
            addCriterion("formula_id is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIdIsNotNull() {
            addCriterion("formula_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaIdEqualTo(String value) {
            addCriterion("formula_id =", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotEqualTo(String value) {
            addCriterion("formula_id <>", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdGreaterThan(String value) {
            addCriterion("formula_id >", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdGreaterThanOrEqualTo(String value) {
            addCriterion("formula_id >=", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLessThan(String value) {
            addCriterion("formula_id <", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLessThanOrEqualTo(String value) {
            addCriterion("formula_id <=", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdLike(String value) {
            addCriterion("formula_id like", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotLike(String value) {
            addCriterion("formula_id not like", value, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdIn(List<String> values) {
            addCriterion("formula_id in", values, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotIn(List<String> values) {
            addCriterion("formula_id not in", values, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdBetween(String value1, String value2) {
            addCriterion("formula_id between", value1, value2, "formulaId");
            return (Criteria) this;
        }

        public Criteria andFormulaIdNotBetween(String value1, String value2) {
            addCriterion("formula_id not between", value1, value2, "formulaId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andUpIsNull() {
            addCriterion("up is null");
            return (Criteria) this;
        }

        public Criteria andUpIsNotNull() {
            addCriterion("up is not null");
            return (Criteria) this;
        }

        public Criteria andUpEqualTo(String value) {
            addCriterion("up =", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotEqualTo(String value) {
            addCriterion("up <>", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThan(String value) {
            addCriterion("up >", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThanOrEqualTo(String value) {
            addCriterion("up >=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThan(String value) {
            addCriterion("up <", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThanOrEqualTo(String value) {
            addCriterion("up <=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLike(String value) {
            addCriterion("up like", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotLike(String value) {
            addCriterion("up not like", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpIn(List<String> values) {
            addCriterion("up in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotIn(List<String> values) {
            addCriterion("up not in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpBetween(String value1, String value2) {
            addCriterion("up between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotBetween(String value1, String value2) {
            addCriterion("up not between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andDownIsNull() {
            addCriterion("down is null");
            return (Criteria) this;
        }

        public Criteria andDownIsNotNull() {
            addCriterion("down is not null");
            return (Criteria) this;
        }

        public Criteria andDownEqualTo(String value) {
            addCriterion("down =", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownNotEqualTo(String value) {
            addCriterion("down <>", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownGreaterThan(String value) {
            addCriterion("down >", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownGreaterThanOrEqualTo(String value) {
            addCriterion("down >=", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownLessThan(String value) {
            addCriterion("down <", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownLessThanOrEqualTo(String value) {
            addCriterion("down <=", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownLike(String value) {
            addCriterion("down like", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownNotLike(String value) {
            addCriterion("down not like", value, "down");
            return (Criteria) this;
        }

        public Criteria andDownIn(List<String> values) {
            addCriterion("down in", values, "down");
            return (Criteria) this;
        }

        public Criteria andDownNotIn(List<String> values) {
            addCriterion("down not in", values, "down");
            return (Criteria) this;
        }

        public Criteria andDownBetween(String value1, String value2) {
            addCriterion("down between", value1, value2, "down");
            return (Criteria) this;
        }

        public Criteria andDownNotBetween(String value1, String value2) {
            addCriterion("down not between", value1, value2, "down");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdIsNull() {
            addCriterion("knowledge_id is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdIsNotNull() {
            addCriterion("knowledge_id is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdEqualTo(Integer value) {
            addCriterion("knowledge_id =", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdNotEqualTo(Integer value) {
            addCriterion("knowledge_id <>", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdGreaterThan(Integer value) {
            addCriterion("knowledge_id >", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_id >=", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdLessThan(Integer value) {
            addCriterion("knowledge_id <", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_id <=", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdIn(List<Integer> values) {
            addCriterion("knowledge_id in", values, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdNotIn(List<Integer> values) {
            addCriterion("knowledge_id not in", values, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_id between", value1, value2, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_id not between", value1, value2, "knowledgeId");
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