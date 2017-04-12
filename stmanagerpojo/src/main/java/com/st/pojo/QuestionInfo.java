package com.st.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class QuestionInfo {
    private String questionId;

    private String content;

    private String url;

    private String upId;

    private String fromId;

    private Integer difficulty;

    private Integer type;

    private Integer count;

    private String solveId;

    private String answerId;

    private Date editDate;

    private Integer state;

    public UserInfo userInfo;
    public TestInfo testInfo;
    public Set QuestionChoiceCon =new HashSet();

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
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

    public String getUpId() {
        return upId;
    }

    public void setUpId(String upId) {
        this.upId = upId == null ? null : upId.trim();
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSolveId() {
        return solveId;
    }

    public void setSolveId(String solveId) {
        this.solveId = solveId == null ? null : solveId.trim();
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId == null ? null : answerId.trim();
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setTestInfo(TestInfo testInfo) {
        this.testInfo = testInfo;
    }

    public TestInfo getTestInfo() {
        return testInfo;
    }

    public void setQuestionChoiceCon(Set questionChoiceCon) {
        QuestionChoiceCon = questionChoiceCon;
    }

    public Set getQuestionChoiceCon() {
        return QuestionChoiceCon;
    }


    @Override
    public String toString() {
        return "QuestionInfo [question_id=" + questionId + ", content=" + content
                + ", url=" + url + ", up_id=" + upId
                + ", from_id=" + fromId + ", difficulty="+difficulty+", type="+ type+",count="+count
                +",solve_id=" +solveId+",answer_id="+answerId+" , edit_date="+editDate+",state="+state
                +",UserInfo="+userInfo+",TestInfo="+testInfo+" ,QuestionChoiceCon=" +QuestionChoiceCon+" ]";
    }

}