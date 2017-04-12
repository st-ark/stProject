package com.st.service;

import com.st.pojo.QuestionInfo;

import java.util.Map;

/**
 * Created by pengzijun on 8/4/2017.
 */
public interface QuestionService {

    /**
     * 根据题目id查询所属试卷信息，卷名
     * */
    Map<String,Object> getQuestionById(String id);




}
