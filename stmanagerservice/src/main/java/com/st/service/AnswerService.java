package com.st.service;

import com.st.common.pojo.AnswerParams;
import com.st.common.pojo.EUTreeNode;
import com.st.common.pojo.StResult;
import com.st.pojo.QuestionAnswer;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
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
