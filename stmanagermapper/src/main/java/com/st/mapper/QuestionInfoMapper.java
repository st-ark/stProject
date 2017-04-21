package com.st.mapper;

import com.st.common.params.QuestionChoice;
import com.st.common.params.QuestionParams;
import com.st.pojo.QuestionInfo;

import java.util.List;

public interface QuestionInfoMapper {


    /**
     * 根据题目id查询所属试卷信息，卷名
     * */
    QuestionInfo getQuestionByid(String id);


    /**
     * 根据题目id查询判断题型，为选择题则查询选项
     * */
    QuestionInfo queryChoiceByQId(String id);

    /**
     * 根据用户权限删除题目
     * @param qId 题目id
     * @return 收影响行数
     */
    int delQuestion(String qId, int state);

    /**
     * 根据题目id查询上传人
     * @param qId
     * @return
     */
    QuestionInfo queryById(String qId, String up_id);

    /**
     * 添加题目
     * @param params
     * @return
     */
    int addQuestion(QuestionParams params);

    /**
     * 修改题目
     * @param params
     * @return
     */
    int updateQuestion(QuestionParams params);

    /**
     * 查询修改题目用户有没有权限
     * @param userId
     * @return
     */
    int queryByUserId(String userId,String questionId);


}