package com.st.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class QuestionChoice {
    private String choiceId;

    private String content;

    private String url;

    private Integer type;

    private Date editDate;

    private Set QuestionChoiceCon =new HashSet();

    public void setQuestionChoiceCon(Set questionChoiceCon) {
        QuestionChoiceCon = questionChoiceCon;
    }

    public Set getQuestionChoiceCon() {
        return QuestionChoiceCon;
    }

    public String getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId == null ? null : choiceId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
}