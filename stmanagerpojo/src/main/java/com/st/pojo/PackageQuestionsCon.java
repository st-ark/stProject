package com.st.pojo;

import java.util.Set;

public class PackageQuestionsCon {
    private Integer id;

    private String packageId;

    private String questionId;

    private PackageInfo pi;

    private QuestionInfo qi;

    public void setQi(QuestionInfo qi) {this.qi = qi;}

    public QuestionInfo getQi() {return qi;}

    public void setPi(PackageInfo pi) {this.pi = pi;}

    public PackageInfo getPi() {return pi;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }
}