package com.st.common.params;

/**
 * Created by Administrator on 2017/4/13.
 */
public class QuestionParams {
    private String content;
    private String url;
    private int type;
    private String upId;
    private String fromId;
    private String questionId;

    public void setContent(String content) {
        this.content = content;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUpId(String upId) {
        this.upId = upId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    public int getType() {
        return type;
    }

    public String getUpId() {
        return upId;
    }

    public String getFromId() {
        return fromId;
    }

    public String getQuestionId() {
        return questionId;
    }
}
