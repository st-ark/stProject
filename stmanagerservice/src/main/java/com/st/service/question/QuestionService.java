package com.st.service.question;

import com.st.pojo.QuestionInfo;

import java.util.Map;

/**
 * Created by pengzijun on 8/4/2017.
 */
public interface QuestionService {

    /**
     * 根据题目id查询所属试卷信息，卷名
     * @param id
     * @return
     */
    Map<String,Object> getQuestionById(String id);

    /**
     * 根据用户权限删除题目
     * @param qId 试卷id
     * @param uId 用户id
     * @return int 受影响行数
     */
    int delQuestion(String qId,String uId);


}
