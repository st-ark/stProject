package com.st.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionSolveConExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionSolveConExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andEyeIdIsNull() {
            addCriterion("eye_id is null");
            return (Criteria) this;
        }

        public Criteria andEyeIdIsNotNull() {
            addCriterion("eye_id is not null");
            return (Criteria) this;
        }

        public Criteria andEyeIdEqualTo(String value) {
            addCriterion("eye_id =", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdNotEqualTo(String value) {
            addCriterion("eye_id <>", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdGreaterThan(String value) {
            addCriterion("eye_id >", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdGreaterThanOrEqualTo(String value) {
            addCriterion("eye_id >=", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdLessThan(String value) {
            addCriterion("eye_id <", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdLessThanOrEqualTo(String value) {
            addCriterion("eye_id <=", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdLike(String value) {
            addCriterion("eye_id like", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdNotLike(String value) {
            addCriterion("eye_id not like", value, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdIn(List<String> values) {
            addCriterion("eye_id in", values, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdNotIn(List<String> values) {
            addCriterion("eye_id not in", values, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdBetween(String value1, String value2) {
            addCriterion("eye_id between", value1, value2, "eyeId");
            return (Criteria) this;
        }

        public Criteria andEyeIdNotBetween(String value1, String value2) {
            addCriterion("eye_id not between", value1, value2, "eyeId");
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

        public Criteria andTrapIdIsNull() {
            addCriterion("trap_id is null");
            return (Criteria) this;
        }

        public Criteria andTrapIdIsNotNull() {
            addCriterion("trap_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrapIdEqualTo(String value) {
            addCriterion("trap_id =", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdNotEqualTo(String value) {
            addCriterion("trap_id <>", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdGreaterThan(String value) {
            addCriterion("trap_id >", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdGreaterThanOrEqualTo(String value) {
            addCriterion("trap_id >=", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdLessThan(String value) {
            addCriterion("trap_id <", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdLessThanOrEqualTo(String value) {
            addCriterion("trap_id <=", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdLike(String value) {
            addCriterion("trap_id like", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdNotLike(String value) {
            addCriterion("trap_id not like", value, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdIn(List<String> values) {
            addCriterion("trap_id in", values, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdNotIn(List<String> values) {
            addCriterion("trap_id not in", values, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdBetween(String value1, String value2) {
            addCriterion("trap_id between", value1, value2, "trapId");
            return (Criteria) this;
        }

        public Criteria andTrapIdNotBetween(String value1, String value2) {
            addCriterion("trap_id not between", value1, value2, "trapId");
            return (Criteria) this;
        }

        public Criteria andEyeCheckIsNull() {
            addCriterion("eye_check is null");
            return (Criteria) this;
        }

        public Criteria andEyeCheckIsNotNull() {
            addCriterion("eye_check is not null");
            return (Criteria) this;
        }

        public Criteria andEyeCheckEqualTo(Integer value) {
            addCriterion("eye_check =", value, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckNotEqualTo(Integer value) {
            addCriterion("eye_check <>", value, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckGreaterThan(Integer value) {
            addCriterion("eye_check >", value, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("eye_check >=", value, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckLessThan(Integer value) {
            addCriterion("eye_check <", value, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckLessThanOrEqualTo(Integer value) {
            addCriterion("eye_check <=", value, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckIn(List<Integer> values) {
            addCriterion("eye_check in", values, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckNotIn(List<Integer> values) {
            addCriterion("eye_check not in", values, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckBetween(Integer value1, Integer value2) {
            addCriterion("eye_check between", value1, value2, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andEyeCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("eye_check not between", value1, value2, "eyeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckIsNull() {
            addCriterion("knowledge_check is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckIsNotNull() {
            addCriterion("knowledge_check is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckEqualTo(Integer value) {
            addCriterion("knowledge_check =", value, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckNotEqualTo(Integer value) {
            addCriterion("knowledge_check <>", value, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckGreaterThan(Integer value) {
            addCriterion("knowledge_check >", value, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_check >=", value, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckLessThan(Integer value) {
            addCriterion("knowledge_check <", value, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_check <=", value, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckIn(List<Integer> values) {
            addCriterion("knowledge_check in", values, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckNotIn(List<Integer> values) {
            addCriterion("knowledge_check not in", values, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_check between", value1, value2, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andKnowledgeCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_check not between", value1, value2, "knowledgeCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckIsNull() {
            addCriterion("formula_check is null");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckIsNotNull() {
            addCriterion("formula_check is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckEqualTo(Integer value) {
            addCriterion("formula_check =", value, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckNotEqualTo(Integer value) {
            addCriterion("formula_check <>", value, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckGreaterThan(Integer value) {
            addCriterion("formula_check >", value, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("formula_check >=", value, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckLessThan(Integer value) {
            addCriterion("formula_check <", value, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckLessThanOrEqualTo(Integer value) {
            addCriterion("formula_check <=", value, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckIn(List<Integer> values) {
            addCriterion("formula_check in", values, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckNotIn(List<Integer> values) {
            addCriterion("formula_check not in", values, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckBetween(Integer value1, Integer value2) {
            addCriterion("formula_check between", value1, value2, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andFormulaCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("formula_check not between", value1, value2, "formulaCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckIsNull() {
            addCriterion("trap_check is null");
            return (Criteria) this;
        }

        public Criteria andTrapCheckIsNotNull() {
            addCriterion("trap_check is not null");
            return (Criteria) this;
        }

        public Criteria andTrapCheckEqualTo(Integer value) {
            addCriterion("trap_check =", value, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckNotEqualTo(Integer value) {
            addCriterion("trap_check <>", value, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckGreaterThan(Integer value) {
            addCriterion("trap_check >", value, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("trap_check >=", value, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckLessThan(Integer value) {
            addCriterion("trap_check <", value, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckLessThanOrEqualTo(Integer value) {
            addCriterion("trap_check <=", value, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckIn(List<Integer> values) {
            addCriterion("trap_check in", values, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckNotIn(List<Integer> values) {
            addCriterion("trap_check not in", values, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckBetween(Integer value1, Integer value2) {
            addCriterion("trap_check between", value1, value2, "trapCheck");
            return (Criteria) this;
        }

        public Criteria andTrapCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("trap_check not between", value1, value2, "trapCheck");
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