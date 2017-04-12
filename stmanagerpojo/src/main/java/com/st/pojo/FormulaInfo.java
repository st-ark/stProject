package com.st.pojo;

import java.util.HashSet;
import java.util.Set;

public class FormulaInfo {
    private String formulaId;

    private String content;

    private String up;

    private String down;

    private Integer type;

    private Integer knowledgeId;

    private Set QuestionSolveCon=new HashSet();

    public void setQuestionSolveCon(Set questionSolveCon) {QuestionSolveCon = questionSolveCon;}

    public Set getQuestionSolveCon() {return QuestionSolveCon;}

    public String getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(String formulaId) {
        this.formulaId = formulaId == null ? null : formulaId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up == null ? null : up.trim();
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down == null ? null : down.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }
}