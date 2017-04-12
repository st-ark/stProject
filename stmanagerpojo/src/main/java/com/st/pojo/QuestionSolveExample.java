package com.st.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionSolveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionSolveExample() {
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

        public Criteria andSolveIdIsNull() {
            addCriterion("solve_id is null");
            return (Criteria) this;
        }

        public Criteria andSolveIdIsNotNull() {
            addCriterion("solve_id is not null");
            return (Criteria) this;
        }

        public Criteria andSolveIdEqualTo(String value) {
            addCriterion("solve_id =", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdNotEqualTo(String value) {
            addCriterion("solve_id <>", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdGreaterThan(String value) {
            addCriterion("solve_id >", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdGreaterThanOrEqualTo(String value) {
            addCriterion("solve_id >=", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdLessThan(String value) {
            addCriterion("solve_id <", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdLessThanOrEqualTo(String value) {
            addCriterion("solve_id <=", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdLike(String value) {
            addCriterion("solve_id like", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdNotLike(String value) {
            addCriterion("solve_id not like", value, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdIn(List<String> values) {
            addCriterion("solve_id in", values, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdNotIn(List<String> values) {
            addCriterion("solve_id not in", values, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdBetween(String value1, String value2) {
            addCriterion("solve_id between", value1, value2, "solveId");
            return (Criteria) this;
        }

        public Criteria andSolveIdNotBetween(String value1, String value2) {
            addCriterion("solve_id not between", value1, value2, "solveId");
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

        public Criteria andUpIdIsNull() {
            addCriterion("up_id is null");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNotNull() {
            addCriterion("up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpIdEqualTo(String value) {
            addCriterion("up_id =", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotEqualTo(String value) {
            addCriterion("up_id <>", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThan(String value) {
            addCriterion("up_id >", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThanOrEqualTo(String value) {
            addCriterion("up_id >=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThan(String value) {
            addCriterion("up_id <", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThanOrEqualTo(String value) {
            addCriterion("up_id <=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLike(String value) {
            addCriterion("up_id like", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotLike(String value) {
            addCriterion("up_id not like", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdIn(List<String> values) {
            addCriterion("up_id in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotIn(List<String> values) {
            addCriterion("up_id not in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdBetween(String value1, String value2) {
            addCriterion("up_id between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotBetween(String value1, String value2) {
            addCriterion("up_id not between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andThumbDownIsNull() {
            addCriterion("thumb_down is null");
            return (Criteria) this;
        }

        public Criteria andThumbDownIsNotNull() {
            addCriterion("thumb_down is not null");
            return (Criteria) this;
        }

        public Criteria andThumbDownEqualTo(Integer value) {
            addCriterion("thumb_down =", value, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownNotEqualTo(Integer value) {
            addCriterion("thumb_down <>", value, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownGreaterThan(Integer value) {
            addCriterion("thumb_down >", value, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumb_down >=", value, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownLessThan(Integer value) {
            addCriterion("thumb_down <", value, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownLessThanOrEqualTo(Integer value) {
            addCriterion("thumb_down <=", value, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownIn(List<Integer> values) {
            addCriterion("thumb_down in", values, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownNotIn(List<Integer> values) {
            addCriterion("thumb_down not in", values, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownBetween(Integer value1, Integer value2) {
            addCriterion("thumb_down between", value1, value2, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbDownNotBetween(Integer value1, Integer value2) {
            addCriterion("thumb_down not between", value1, value2, "thumbDown");
            return (Criteria) this;
        }

        public Criteria andThumbUpIsNull() {
            addCriterion("thumb_up is null");
            return (Criteria) this;
        }

        public Criteria andThumbUpIsNotNull() {
            addCriterion("thumb_up is not null");
            return (Criteria) this;
        }

        public Criteria andThumbUpEqualTo(Integer value) {
            addCriterion("thumb_up =", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpNotEqualTo(Integer value) {
            addCriterion("thumb_up <>", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpGreaterThan(Integer value) {
            addCriterion("thumb_up >", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumb_up >=", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpLessThan(Integer value) {
            addCriterion("thumb_up <", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpLessThanOrEqualTo(Integer value) {
            addCriterion("thumb_up <=", value, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpIn(List<Integer> values) {
            addCriterion("thumb_up in", values, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpNotIn(List<Integer> values) {
            addCriterion("thumb_up not in", values, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpBetween(Integer value1, Integer value2) {
            addCriterion("thumb_up between", value1, value2, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andThumbUpNotBetween(Integer value1, Integer value2) {
            addCriterion("thumb_up not between", value1, value2, "thumbUp");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(String value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(String value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(String value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(String value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLike(String value) {
            addCriterion("question_id like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotLike(String value) {
            addCriterion("question_id not like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<String> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<String> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(String value1, String value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(String value1, String value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andEditDateIsNull() {
            addCriterion("edit_date is null");
            return (Criteria) this;
        }

        public Criteria andEditDateIsNotNull() {
            addCriterion("edit_date is not null");
            return (Criteria) this;
        }

        public Criteria andEditDateEqualTo(Date value) {
            addCriterion("edit_date =", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotEqualTo(Date value) {
            addCriterion("edit_date <>", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateGreaterThan(Date value) {
            addCriterion("edit_date >", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_date >=", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateLessThan(Date value) {
            addCriterion("edit_date <", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateLessThanOrEqualTo(Date value) {
            addCriterion("edit_date <=", value, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateIn(List<Date> values) {
            addCriterion("edit_date in", values, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotIn(List<Date> values) {
            addCriterion("edit_date not in", values, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateBetween(Date value1, Date value2) {
            addCriterion("edit_date between", value1, value2, "editDate");
            return (Criteria) this;
        }

        public Criteria andEditDateNotBetween(Date value1, Date value2) {
            addCriterion("edit_date not between", value1, value2, "editDate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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