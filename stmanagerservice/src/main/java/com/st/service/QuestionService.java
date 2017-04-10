package com.st.service;

import com.st.pojo.QuestionInfo;

/**
 * Created by pengzijun on 8/4/2017.
 */
public interface QuestionService {
    //接口
    QuestionInfo getQuestionById(String questionId,int type);
}
