package com.st.pojo;

import java.util.HashSet;
import java.util.Set;

public class QuestionEye {
    private String eyeId;

    private String content;

    private Integer type;

    //private Set QuestionSolveCon=new HashSet();

    //public void setQuestionSolveCon(Set questionSolveCon) {QuestionSolveCon = questionSolveCon;}

    //public Set getQuestionSolveCon() {return QuestionSolveCon;}


    public String getEyeId() {
        return eyeId;
    }

    public void setEyeId(String eyeId) {
        this.eyeId = eyeId == null ? null : eyeId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}