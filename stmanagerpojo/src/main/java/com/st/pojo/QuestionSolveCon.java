package com.st.pojo;

import java.util.HashSet;
import java.util.Set;

public class QuestionSolveCon {
    private Integer id;

    private String solveId;

    private String questionId;

    private String eyeId;

    private Integer knowledgeId;

    private String formulaId;

    private String trapId;

    private Integer eyeCheck;

    private Integer knowledgeCheck;

    private Integer formulaCheck;

    private Integer trapCheck;

    private Set QuestionSolve =new HashSet();

    private KnowledgeInfo ki;

    private QuestionEye qe;

    private QuestionTrap qt;

    private FormulaInfo fi;

    public void setKi(KnowledgeInfo ki) {
        this.ki = ki;
    }

    public void setQe(QuestionEye qe) {
        this.qe = qe;
    }

    public void setQt(QuestionTrap qt) {
        this.qt = qt;
    }

    public void setFi(FormulaInfo fi) {
        this.fi = fi;
    }

    public KnowledgeInfo getKi() {
        return ki;
    }

    public QuestionEye getQe() {
        return qe;
    }

    public QuestionTrap getQt() {
        return qt;
    }

    public FormulaInfo getFi() {
        return fi;
    }

    public void setQuestionSolve(Set questionSolve) {
        QuestionSolve = questionSolve;
    }

    public Set getQuestionSolve() {
        return QuestionSolve;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSolveId() {
        return solveId;
    }

    public void setSolveId(String solveId) {
        this.solveId = solveId == null ? null : solveId.trim();
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    public String getEyeId() {
        return eyeId;
    }

    public void setEyeId(String eyeId) {
        this.eyeId = eyeId == null ? null : eyeId.trim();
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(String formulaId) {
        this.formulaId = formulaId == null ? null : formulaId.trim();
    }

    public String getTrapId() {
        return trapId;
    }

    public void setTrapId(String trapId) {
        this.trapId = trapId == null ? null : trapId.trim();
    }

    public Integer getEyeCheck() {
        return eyeCheck;
    }

    public void setEyeCheck(Integer eyeCheck) {
        this.eyeCheck = eyeCheck;
    }

    public Integer getKnowledgeCheck() {
        return knowledgeCheck;
    }

    public void setKnowledgeCheck(Integer knowledgeCheck) {
        this.knowledgeCheck = knowledgeCheck;
    }

    public Integer getFormulaCheck() {
        return formulaCheck;
    }

    public void setFormulaCheck(Integer formulaCheck) {
        this.formulaCheck = formulaCheck;
    }

    public Integer getTrapCheck() {
        return trapCheck;
    }

    public void setTrapCheck(Integer trapCheck) {
        this.trapCheck = trapCheck;
    }
}