package com.st.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class KnowledgeInfo {
    private Integer knowledgeId;

    private String name;

    private Integer unitId;

    private String formulaId;

    private Date editDate;

    private QuestionSolveCon qsc;

    public void setQsc(QuestionSolveCon qsc) {
        this.qsc = qsc;
    }

    public QuestionSolveCon getQsc() {
        return qsc;
    }
    // private Set QuestionSolveCon=new HashSet();

   // public void setQuestionSolveCon(Set questionSolveCon) {QuestionSolveCon = questionSolveCon;}

    //public Set getQuestionSolveCon() {return QuestionSolveCon;}

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(String formulaId) {
        this.formulaId = formulaId == null ? null : formulaId.trim();
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
}