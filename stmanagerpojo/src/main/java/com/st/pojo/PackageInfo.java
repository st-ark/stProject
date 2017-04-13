package com.st.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PackageInfo {
    private String packageId;

    private String name;

    private String upId;

    private Integer difficulty;

    private Integer count;

    private Date editDate;

    private Integer thumbUp;

    private Integer thumpDown;

    private String content;

    private Integer type;

    private Integer state;

    private Set PackageQuestionsCon =new HashSet();

    private UserInfo ui;

    public void setUi(UserInfo ui) {this.ui = ui;}

    public UserInfo getUi() {return ui;}

    public void setPackageQuestionsCon(Set packageQuestionsCon) {
        PackageQuestionsCon = packageQuestionsCon;
    }

    public Set getPackageQuestionsCon() {
        return PackageQuestionsCon;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUpId() {
        return upId;
    }

    public void setUpId(String upId) {
        this.upId = upId == null ? null : upId.trim();
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Integer getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    public Integer getThumpDown() {
        return thumpDown;
    }

    public void setThumpDown(Integer thumpDown) {
        this.thumpDown = thumpDown;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}