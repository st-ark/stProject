package com.st.common.params;

/**
 * Created by Administrator on 2017/4/17.
 */
public class QuestionChoice {
    private String choiceId;
    private String content;
    private String url;
    private String type;

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChoiceId() {
        return choiceId;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }
}
