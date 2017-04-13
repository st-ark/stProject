package com.st.service;

import com.st.common.params.AnswerParams;
import com.st.pojo.QuestionAnswer;

import java.util.Map;

/**
 * 答案模块
 * Created by Administrator on 2017/4/10.
 */
public interface AnswerService {

    /**
     * 查询答案信息
     */
    Map<String,Object> getAnswerList(String questionId);

    /**
     * 增加答案
     */
   QuestionAnswer  addAnswer(AnswerParams params);

    /**
     * 修改答案
     */
   QuestionAnswer updateAnswer(AnswerParams params);

    /**
     * 删除答案
     */
    QuestionAnswer deleteAnswer(AnswerParams params, String answerId);
}
