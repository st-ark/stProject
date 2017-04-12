package com.st.pojo;

import java.util.HashSet;
import java.util.Set;

public class QuestionTrap {
    private String trapId;

    private String content;

    private Integer type;
    private Set QuestionSolveCon=new HashSet();

    public void setQuestionSolveCon(Set questionSolveCon) {QuestionSolveCon = questionSolveCon;}

    public Set getQuestionSolveCon() {return QuestionSolveCon;}

    public String getTrapId() {
        return trapId;
    }

    public void setTrapId(String trapId) {
        this.trapId = trapId == null ? null : trapId.trim();
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