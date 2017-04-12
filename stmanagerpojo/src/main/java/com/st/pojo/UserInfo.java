package com.st.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserInfo {
    private String userId;

    private String openId;

    private String nickName;

    private String avatar;

    private String state;

    private String schoolId;

    private Long phone;

    private String groupId;

    private Integer groupRanking;

    private Integer type;

    private Date editDate;

    private Integer knowledgeCount;

    private Double wallet;

    private Date loginDate;

    private Long score;

    private SchoolInfo schoolInfo;

    private Set QuestionInfo =new HashSet();//题目

    private Set QuestionSolve=new HashSet();

    public void setQuestionSolve(Set questionSolve) {
        QuestionSolve = questionSolve;
    }

    public Set getQuestionSolve() {
        return QuestionSolve;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Integer getGroupRanking() {
        return groupRanking;
    }

    public void setGroupRanking(Integer groupRanking) {
        this.groupRanking = groupRanking;
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

    public Integer getKnowledgeCount() {
        return knowledgeCount;
    }

    public void setKnowledgeCount(Integer knowledgeCount) {
        this.knowledgeCount = knowledgeCount;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public void setQuestionInfo(Set questionInfo) {
        QuestionInfo = questionInfo;
    }

    public void setSchoolInfo(SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public SchoolInfo getSchoolInfo() {
        return schoolInfo;
    }

    public Set getQuestionInfo() {
        return QuestionInfo;
    }
}