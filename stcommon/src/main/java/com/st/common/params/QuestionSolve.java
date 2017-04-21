package com.st.common.params;

/**
 * Created by Administrator on 2017/4/19.
 */
public class QuestionSolve {
    private String solveId;
    private String  content;
    private String upId;
    private String questionId;

    public void setSolveId(String solveId) {
        this.solveId = solveId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUpId(String upId) {
        this.upId = upId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getSolveId() {
        return solveId;
    }

    public String getContent() {
        return content;
    }

    public String getUpId() {
        return upId;
    }

    public String getQuestionId() {
        return questionId;
    }
}
