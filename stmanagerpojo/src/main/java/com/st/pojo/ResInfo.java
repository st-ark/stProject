package com.st.pojo;

import java.util.Date;

public class ResInfo {
    private String resId;

    private String userId;

    private Integer type;

    private Long knowledgeId;

    private Date editdate;

    private String title;

    private Long thumbUp;

    private Long thumbDown;

    private Integer state;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public Date getEditdate() {
        return editdate;
    }

    public void setEditdate(Date editdate) {
        this.editdate = editdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Long thumbUp) {
        this.thumbUp = thumbUp;
    }

    public Long getThumbDown() {
        return thumbDown;
    }

    public void setThumbDown(Long thumbDown) {
        this.thumbDown = thumbDown;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}