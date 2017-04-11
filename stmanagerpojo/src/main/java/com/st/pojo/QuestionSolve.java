package com.st.pojo;

import java.util.Date;

public class QuestionSolve {
    private String solveId;

    private String content;

    private String upId;

    private Integer thumbDown;

    private Integer thumbUp;

    private String questionId;

    private Date editDate;

    private Integer state;

    public String getSolveId() {
        return solveId;
    }

    public void setSolveId(String solveId) {
        this.solveId = solveId == null ? null : solveId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUpId() {
        return upId;
    }

    public void setUpId(String upId) {
        this.upId = upId == null ? null : upId.trim();
    }

    public Integer getThumbDown() {
        return thumbDown;
    }

    public void setThumbDown(Integer thumbDown) {
        this.thumbDown = thumbDown;
    }

    public Integer getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
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
}