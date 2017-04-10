package com.st.service.impl;

import com.st.mapper.QuestionInfoMapper;

import com.st.pojo.*;
import com.st.pojo.QuestionInfoExample.Criteria;
import com.st.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 题目加载Service
 * Created by pengzijun on 8/4/2017.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionInfoMapper questionInfoMapper;

    @Override
    public QuestionInfo getQuestionById(String questionId, int type) {
        QuestionInfoExample example = new QuestionInfoExample();
        //添加查询条件
        Criteria criteria = example.createCriteria();
        criteria.andQuestionIdEqualTo(questionId);
        List<QuestionInfo> list = questionInfoMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            QuestionInfo questionInfo = list.get(0);
            return questionInfo;
        }
        return null;
    }


}
