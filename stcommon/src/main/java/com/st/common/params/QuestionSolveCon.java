package com.st.common.params;

/**
 * Created by Administrator on 2017/4/19.
 */
public class QuestionSolveCon {
    private String solveId;
    private String questionId;
    private int knowledgeId;
    private int knowledgeCheck;
    private String eyeId;
    private int eyeCheck;
    private String trapId;
    private int trapCheck;
    private String formulaId;
    private int formulaCheck;

    public void setSolveId(String solveId) {
        this.solveId = solveId;
    }

    public String getSolveId() {
        return solveId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setKnowledgeId(int knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public void setKnowledgeCheck(int knowledgeCheck) {
        this.knowledgeCheck = knowledgeCheck;
    }

    public void setEyeId(String eyeId) {
        this.eyeId = eyeId;
    }

    public void setEyeCheck(int eyeCheck) {
        this.eyeCheck = eyeCheck;
    }

    public void setTrapId(String trapId) {
        this.trapId = trapId;
    }

    public void setTrapCheck(int trapCheck) {
        this.trapCheck = trapCheck;
    }

    public void setFormulaId(String formulaId) {
        this.formulaId = formulaId;
    }

    public void setFormulaCheck(int formulaCheck) {
        this.formulaCheck = formulaCheck;
    }

    public int getKnowledgeId() {
        return knowledgeId;
    }

    public int getKnowledgeCheck() {
        return knowledgeCheck;
    }

    public String getEyeId() {
        return eyeId;
    }

    public int getEyeCheck() {
        return eyeCheck;
    }

    public String getTrapId() {
        return trapId;
    }

    public int getTrapCheck() {
        return trapCheck;
    }

    public String getFormulaId() {
        return formulaId;
    }

    public int getFormulaCheck() {
        return formulaCheck;
    }
}
