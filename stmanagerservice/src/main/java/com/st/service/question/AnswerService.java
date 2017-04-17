package com.st.service.question;

import com.st.common.answerparam.AnswerParams;
import com.st.common.answerparam.ResList;
import com.st.common.answerparam.SkillList;
import com.st.pojo.QuestionAnswer;

import java.util.Map;

/**
 * 答案模块
 * Created by Administrator on 2017/4/10.
 */
public interface AnswerService {
    /**
     * 通过题目ID查询答案信息
     */
    Map<String,Object> getAnswerList(String questionId);
    /**
     * 增加答案
     */
   QuestionAnswer  addAnswer(AnswerParams params, SkillList skillList, ResList resList);
    /**
     * 修改答案
     */
   QuestionAnswer updateAnswer(AnswerParams params,SkillList skillList,ResList resList);
    /**
     * 删除答案
     */
    QuestionAnswer deleteAnswer(AnswerParams params, String answerId);
}
