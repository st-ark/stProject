package com.st.pojo;

public class QuestionChoiceCon {
    private Integer id;

    private String questionId;

    private String choiceId;

    private QuestionInfo qi;

    private QuestionChoice qc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    public String getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId == null ? null : choiceId.trim();
    }

    public void setQi(QuestionInfo qi) {
        this.qi = qi;
    }

    public void setQc(QuestionChoice qc) {
        this.qc = qc;
    }

    public QuestionInfo getQi() {
        return qi;
    }

    public QuestionChoice getQc() {
        return qc;
    }
}